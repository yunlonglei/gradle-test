package com.lei.gradletest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author leiyunlong
 * @since 2021/12/13 3:50 PM
 * @version 1.0
 */
@RequestMapping("test")
@RestController
class TestController {
    @GetMapping("hello")
    String Test(){
        "Hello,World"
    }

}
