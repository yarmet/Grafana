package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {


    @GetMapping(value = "/data")
    public String getData(){
        return "wqeqwe";
    }

}
