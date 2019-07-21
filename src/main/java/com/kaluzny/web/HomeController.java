package com.kaluzny.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String metodo() {
        return "App funciona::::";
    }

}
