package me.dhlee.springboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecuritySampleController {
    @GetMapping("/")
    public String index() {
        System.out.println("index");

        return "index";
    }

    @RequestMapping("/guest")
    public void forGuest() {
        System.out.println("guest");
    }

    @RequestMapping("/manager")
    public void forManager() {
        System.out.println("manager");
    }

    @RequestMapping("/admin")
    public void forAdmin() {
        System.out.println("admin");
    }
}
