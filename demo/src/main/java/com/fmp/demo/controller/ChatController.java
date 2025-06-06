package com.fmp.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.fmp.demo.dto.ChatsDTO;

@Controller
public class ChatController {

    // (1) 기존: 채팅 메시지 브로드캐스트
    @MessageMapping("/chat/{roomId}")
    @SendTo("/topic/chat/{roomId}")
    public ChatsDTO sendRoomMessage(
            @DestinationVariable("roomId") String roomId,
            ChatsDTO chatsDTO) {

        // 서버 타임스탬프 추가
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        chatsDTO.setTimestamp1(now);
        return chatsDTO;
    }

    // (2) 새로 추가: 나가기 요청 처리
    @MessageMapping("/chat/{roomId}/leave")
    @SendTo("/topic/chat/{roomId}")
    public ChatsDTO leaveRoom(
            @DestinationVariable("roomId") String roomId,
            ChatsDTO chatsDTO) {
        // leave용 DTO를 리턴하면, 해당 방을 구독 중인 모두가 받게 됩니다.
        // 여기서는 chatsDTO.getSenderId()가 나간 사람의 ID여야 합니다.
        // 메시지는 “LEAVE”라는 특별한 텍스트로 보내도록 하겠습니다.
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        ChatsDTO leaveNotice = new ChatsDTO();
        leaveNotice.setSenderId(chatsDTO.getSenderId()); // 나간 사람의 ID
        leaveNotice.setText("LEAVE");                     // 특별한 키워드
        leaveNotice.setTimestamp1(now);
        return leaveNotice;
    }
}
