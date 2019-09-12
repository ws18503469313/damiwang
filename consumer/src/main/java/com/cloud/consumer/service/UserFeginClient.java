package com.cloud.consumer.service;

import com.cloud.model.User;
import com.cloud.util.JSONResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "user-provide")
public interface UserFeginClient {

    @RequestMapping(value = "test/findById/{id}")
    public User getById(@PathVariable(value = "id")String id);

    @RequestMapping(value = "/main/ajaxLogin", method = RequestMethod.POST)
    public JSONResult ajaxLogin(@RequestBody User user);
}
