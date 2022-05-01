package com.example.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mapconfig.xml");
        Customer customer = (Customer) ctx.getBean("customer");

        System.out.println(customer);
    }
}
