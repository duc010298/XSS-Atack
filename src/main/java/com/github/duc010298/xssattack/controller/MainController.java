package com.github.duc010298.xssattack.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @CrossOrigin(origins = "https://truejuice.vn")
    @PostMapping
    public String Test(@RequestBody String object) {
        System.out.println(object);
        return "Done";
    }
}