package com.cloud.consumer;

import com.cloud.consumer.customerbean.MyBeanFactoryPostProcessor;
import com.cloud.consumer.customerbean.MyBeanPostProcessor;
import com.cloud.consumer.customerbean.MyInstantiationAwareBeanPostProcessor;
import com.cloud.consumer.customerbean.Person;
import com.cloud.consumer.inteface.ExcludeCompoentScan;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ExcludeCompoentScan.class)})
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced//ribbon客户端负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public BeanPostProcessor beanPostProcessor() {
//        return new MyBeanPostProcessor();
//    }
//
//    @Bean
//    public InstantiationAwareBeanPostProcessor instantiationAwareBeanPostProcessor() {
//        return new MyInstantiationAwareBeanPostProcessor();
//    }
//    @Bean
//    public BeanFactoryPostProcessor beanFactoryPostProcessor() {
//        return new MyBeanFactoryPostProcessor();
//    }
}
