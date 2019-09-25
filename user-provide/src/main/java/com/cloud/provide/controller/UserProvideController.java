package com.cloud.provide.controller;

import com.cloud.model.DmUser;
import com.cloud.utils.JSONResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProvideController {

    @PostMapping("/login")
    public JSONResult login(@RequestBody DmUser dmUser)throws Exception{
        return JSONResult.ok(new DmUser());
    }
}
