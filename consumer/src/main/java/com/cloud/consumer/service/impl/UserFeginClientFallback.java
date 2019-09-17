package com.cloud.consumer.service.impl;

import com.cloud.consumer.service.UserFeginClient;
import com.cloud.model.User;
import com.cloud.util.JSONResult;
import org.springframework.stereotype.Component;

@Component
public class UserFeginClientFallback implements UserFeginClient {

    @Override
    public User getById(String id) {
        return new User();
    }

    @Override
    public JSONResult ajaxLogin(User user) {
        return JSONResult.errorMsg("fail");
    }
}
