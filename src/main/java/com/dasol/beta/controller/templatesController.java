package com.dasol.beta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class templatesController {

    @GetMapping("/beta")
    public String beta() {
        return "main";
    }
}
