package com.cloud.consumer.controller;

import org.checkerframework.checker.units.qual.K;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("sendKafka")
    public String sendMessage()  throws Exception {
        for(int i = 31; i < 40; i++){
            ListenableFuture<SendResult<String, String>>  future =
                    kafkaTemplate.send("user_consumer","comsumer_log", "log_value"+i);
            System.out.println(future.get());
        }
        return "ok";
    }
}
