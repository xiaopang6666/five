package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//ttt
@RestController
@RequestMapping("/")
public class Hello {

    @RequestMapping("hello")
    public List<String> h(){
        ArrayList<String> result = new ArrayList<>();
        result.add("qwe");
        result.add("www");
        System.out.println(6678);
        //ssss
        //ww
        return result;
    }
}
