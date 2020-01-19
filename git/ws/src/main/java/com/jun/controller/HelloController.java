package com.jun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @date 2020-01-18 20:01
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public  String  getHello(){
        return "范家怡";
    }
    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }
    @GetMapping("/second")
    public String getSecond(){
        return "00";
    }
    public static void main(String[] args) {
        System.out.println("Nihao");
    }

    public void getIndexs(){
        System.out.println("hdhfhahhf");
	System.out.println("你好");
    }
}
