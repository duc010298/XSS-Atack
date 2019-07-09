package com.github.duc010298.xssattack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @PostMapping("/")
    public void Test(@RequestParam("content") String content) {
        System.out.println(content);
    }
}