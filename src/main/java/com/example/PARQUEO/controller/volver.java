package com.example.PARQUEO.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class volver {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
