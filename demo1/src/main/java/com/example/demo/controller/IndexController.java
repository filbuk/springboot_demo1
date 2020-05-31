package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(){
        return "hello world！";
    }

    @RequestMapping("user/{id}")
    public User getUser(@PathVariable int id){
        return userService.find(id);
    }

    @RequestMapping("userList")
    public ArrayList<User> getUserList(){
        return userService.findAll();
    }
}
