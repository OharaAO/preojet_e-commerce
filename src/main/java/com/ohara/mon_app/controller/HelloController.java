package com.ohara.mon_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "<h1>Le server marche mais il n'y a rien a voir ici</h1>";
    }
}
