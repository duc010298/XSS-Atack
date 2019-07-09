package com.github.duc010298.xssattack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @CrossOrigin(origins = "https://truejuice.vn")
    @PostMapping("/")
    public void Test(@RequestParam("object") String object) {
        System.out.println(object);
    }
}