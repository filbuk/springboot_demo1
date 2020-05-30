package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello world！";
    }

    @RequestMapping("/map")
    public Map map(){
        HashMap hashMap = new HashMap<String, String>();
        hashMap.put("a", "b");
        return hashMap;
    }

}
