package com.cloud.consumer.controller;

import com.cloud.client.DmUserFeginClient;
import com.cloud.model.DmUser;
import com.cloud.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConsumerController {
    @Autowired
    private DmUserFeginClient userFeginClient;

    @GetMapping("/login")
    public JSONResult login()  throws Exception {
        return userFeginClient.login(new DmUser());
    }
}
