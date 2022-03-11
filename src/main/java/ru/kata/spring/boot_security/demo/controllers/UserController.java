package ru.kata.spring.boot_security.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping
    public String homepage(){
        return "index";
    }

    @GetMapping("/index")
    public String indexPage(){
        return "index";
    }

}
