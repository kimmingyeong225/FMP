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


}
