package com.fmp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 채팅 controller
 */

@Controller
@RequestMapping("/dm")
//http://localhost:8080/dm
public class ChatsController {
    @GetMapping
    public String chat() {
        return "chat";  // => /WEB-INF/layout/chat.html
    }
}