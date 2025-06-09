package com.fmp.demo.dto;

import java.time.LocalDateTime;

import jakarta.persistence.PrePersist;

// 채팅 DTO
public class ChatsDTO {
	
	private Long chatId;
	private String senderId;
	private String receiverId;
	private String text;
	private LocalDateTime timestamp;

	@PrePersist
	private void onCreate() {
		this.timestamp = LocalDateTime.now();
	}

}
