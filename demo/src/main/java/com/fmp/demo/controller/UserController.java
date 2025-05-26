package com.fmp.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fmp.demo.dto.UserDTO;
import com.fmp.demo.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

	private final UserService userService;

//	@GetMapping("/login")
//	public String loginPage() {
//		return "signIn"; //templates/signIn.html 파일명
//	}

	@PostMapping("/login")
	public ResponseEntity<?> login(
	    @RequestParam("userId") String userId,
	    @RequestParam("password") String password
	) {
	    UserDTO userDTO = userService.login(userId, password);
	    if (userDTO != null) {
	        return ResponseEntity.ok(userDTO);
	    } else {
	        return ResponseEntity.status(401).body("아이디 또는 비밀번호가 일치하지 않습니다.");
	    }
	}

}
