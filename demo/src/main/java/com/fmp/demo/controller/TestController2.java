package com.fmp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController2 {

    @GetMapping("/")
    public String index() {
        return "index";  // src/main/resources/templates/index.html
    }

//    @GetMapping("/match")
//    public String matchResult(Model model) {
//        // TODO: 실제 랜덤 매칭 로직을 서비스로 분리
//        List<String> matchedPairs = List.of(
//            "홍길동 ↔ 김철수",
//            "이영희 ↔ 박민수",
//            "최수민 ↔ 장예린"
//        );
//        model.addAttribute("pairs", matchedPairs);
//        return "match-result";  // src/main/resources/templates/match-result.html
//    }
}
