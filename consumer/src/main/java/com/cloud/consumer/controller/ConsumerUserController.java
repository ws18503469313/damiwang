package com.cloud.consumer.controller;

import com.cloud.consumer.inteface.ExcludeCompoentScan;
import com.cloud.consumer.service.UserFeginClient;
import com.cloud.model.User;
import com.cloud.util.JSONResult;
import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Random;

@RestController
//@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ExcludeCompoentScan.class)})
public class ConsumerUserController {
    private static final Logger log = LoggerFactory.getLogger(ConsumerUserController.class);

    @Autowired
    private UserFeginClient userFeginClient;
//    @Autowired
//    private RestTemplate restTemplate;
//    @Autowired
//    private LoadBalancerClient balancerClient;
    @RequestMapping("/get")
    public User get(String id){
        return userFeginClient.getById(id);
    }

    @RequestMapping("/login")
    public JSONResult login(User user){
//        JSONResult result = restTemplate.getf
        return userFeginClient.ajaxLogin(user);
    }
}
