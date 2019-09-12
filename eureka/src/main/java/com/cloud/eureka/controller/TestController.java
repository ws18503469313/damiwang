package com.cloud.eureka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);
    @RequestMapping("/test")
    public String test(){
        log.info("dwadawdwadaaaaaaaaaaaaaaaaa");
        return "adwadaw";
    }
}
