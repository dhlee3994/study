package me.dhlee.springboot2.controller;

import me.dhlee.springboot2.domain.Board;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/sample")
    public Board makeSample() {
        Board vo = new Board();
        vo.setTitle("제목");
        vo.setWriter("지은이");
        vo.setContent("내용");
        System.out.println(vo);
        return vo;
    }
}
