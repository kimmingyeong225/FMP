package com.fmp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fmp.demo.dto.UserDTO;
import com.fmp.demo.service.UserService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

	private final UserService userService;

	@PostMapping("/login")
	public String login(@RequestParam("userId") String userId,
						@RequestParam("password") String password,
						HttpSession session,
						Model model) {

		UserDTO userDTO = userService.login(userId, password);

		if (userDTO != null) {
			// ✅ 세션에 userId, studentId 모두 저장
			session.setAttribute("userId", userDTO.getUserId());
			session.setAttribute("studentId", userDTO.getStudentId()); // ⭐️ 추가된 부분

			return "redirect:/match";
		} else {
			model.addAttribute("error", "아이디 또는 비밀번호가 일치하지 않습니다.");
			return "signIn";
		}
	}
}
