package com.fmp.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

//REST API 전용 컨트롤러 (반드시 @RestController)
@RestController
public class ChatInfoApiController {
	
	@GetMapping("/api/chat/info")
	public Map<String, Object> chatInfo(HttpSession session) {
	    // 1. 내 정보: 로그인 시 세션에 저장한 값 불러오기
	    String myUserId = (String) session.getAttribute("studentId");
	    String myName = (String) session.getAttribute("name");
	    String myProfileUrl = (String) session.getAttribute("profileUrl");

	    // 2. 상대방 정보: 매칭 완료시 세션/DB에 저장된 값 불러오기
	    String opponentUserId = (String) session.getAttribute("opponentId");
	    String opponentName = (String) session.getAttribute("opponentName");
	    String opponentProfile = (String) session.getAttribute("opponentProfileUrl");

	    // 또는, userService.findById(opponentUserId) 등으로 DB에서 불러올 수도 있음

	    return Map.of(
	        "myUserId", myUserId,
	        "myName", myName,
	        "myProfile", myProfileUrl,
	        "opponentUserId", opponentUserId,
	        "opponentName", opponentName,
	        "opponentProfile", opponentProfile
	    );
	}


}
