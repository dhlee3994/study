package me.dhlee.springboot2.controller;

import me.dhlee.springboot2.domain.SampleVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/sample")
    public SampleVO makeSample() {
        SampleVO vo = new SampleVO("v1", "v2", "v3");
        System.out.println(vo);
        return vo;
    }
}
