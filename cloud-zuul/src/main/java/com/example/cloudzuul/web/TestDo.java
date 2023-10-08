package com.example.cloudzuul.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("zuul")
public class TestDo {
    @RequestMapping("demo")
    String demo(){
        return "zuul demo !";
    }
    @RequestMapping("hello")
    String hello(){
        return "hello git";
    }
}
