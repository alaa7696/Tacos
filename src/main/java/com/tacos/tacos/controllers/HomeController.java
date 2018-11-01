package com.tacos.tacos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    public static final String home="home";

    @GetMapping("/")
    public String homePage(){
        return home;
    }

}
