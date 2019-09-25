package com.cloud.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProvideApplication.class, args);
    }

}
