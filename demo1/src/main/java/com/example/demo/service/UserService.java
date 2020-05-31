package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public ArrayList<User> findAll(){
        return userMapper.findAll();
    }

    public User find(int id) {
        return userMapper.find(id);
    }
}
