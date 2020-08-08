package me.dhlee.springboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boards/")
public class WebBoardController {
    @GetMapping("/list")
    public void list() {
        System.out.println("list() called...");

    }
}

