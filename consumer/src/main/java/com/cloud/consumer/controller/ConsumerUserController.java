package com.cloud.consumer.controller;

import com.cloud.consumer.service.UserFeginClient;
import com.cloud.model.User;
import com.cloud.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerUserController {
    @Autowired
    private UserFeginClient userFeginClient;

    @RequestMapping("/get")
    public User get(String id){
        return userFeginClient.getById(id);
    }

    @RequestMapping("/login")
    public JSONResult login(User user){
        return userFeginClient.ajaxLogin(user);
    }
}
