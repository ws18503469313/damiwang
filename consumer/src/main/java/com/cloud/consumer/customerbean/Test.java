package com.cloud.consumer.customerbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Test {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static void main(String[] args) {

        System.out.println("现在开始初始化容器");
        System.out.println("=========================");
        ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("=========================");
        System.out.println("容器初始化成功");

        //得到Preson，并使用
        System.out.println("=========test===============");
        Person person = factory.getBean("person", Person.class);
        System.out.println(person.toString());
        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext) factory).registerShutdownHook();
    }
}
