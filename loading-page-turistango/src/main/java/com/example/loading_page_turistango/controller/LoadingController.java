package com.example.loading_page_turistango.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoadingController {

    @GetMapping("/")
    public String showLoadingPage() {

        return "loading";
    }
}