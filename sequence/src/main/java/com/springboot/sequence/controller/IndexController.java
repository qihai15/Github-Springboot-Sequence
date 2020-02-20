package com.springboot.sequence.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with Intellij IDEA
 * EFFECT:
 * AUTHOR: rambo
 * Data: 2020/2/20
 * Time: 7:17 PM
 */
@RestController
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "Springboot Sequence";
    }
}
