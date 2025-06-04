package com.fmp.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fmp.demo.repository.model.Chats;
import com.fmp.demo.service.ChatService;

import lombok.RequiredArgsConstructor;


/*
 * 채팅 controller
 */

@Controller
@RequestMapping("/dm")
@RequiredArgsConstructor
//http://localhost:8080/dm
public class ChatsController {
	

	    private final ChatService chatsService;

	    // 채팅 화면 (view)
	    @GetMapping({"", "/"})
	    public String chatRoot() {
	        return "chat";
	    }

	    @GetMapping("/{matchId}")
	    public String chatWithMatchId(@PathVariable("matchId") String matchId, Model model) {
	        model.addAttribute("matchId", matchId);
	        return "chat";
	    }

	    // 1:1 채팅 내역 조회 (REST API)
	    @GetMapping("/messages")
	    @ResponseBody // ★ REST API로 반환
	    public List<Chats> getChatMessages(@RequestParam String userId1,
	                                       @RequestParam String userId2) {
	        return chatsService.getChatMessages(userId1, userId2);
	    }

	    // (선택) 전체 메시지 삭제
	    @DeleteMapping("/messages")
	    @ResponseBody
	    public void deleteChatMessages(@RequestParam String userId1,
	                                   @RequestParam String userId2) {
	        chatsService.deleteChatMessages(userId1, userId2);
	    }

}