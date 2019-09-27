package com.fifi.springboottest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.yml");
        HelloInterface helloInterface = context.getBean(HelloInterface.class);
        helloInterface.sayHelllo();
        context.close();

        System.out.println();
    }
}
