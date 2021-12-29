package com.lei.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leiyunlong
 * @version 1.0
 * @since 2021/12/29 5:54 PM
 */
@RequestMapping("test")
@RestController
public class TestController {
    @GetMapping("hello")
    public String hello(){
        return "hello,world!";
    }
}
