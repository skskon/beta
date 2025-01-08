package com.dasol.beta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class templatesController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
