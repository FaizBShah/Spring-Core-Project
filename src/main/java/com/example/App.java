package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Creating the Application Context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        // Getting the Spring Bean from the Context object by bean id
        Employee emp = (Employee) ctx.getBean("emp");
        System.out.println(emp);
    }
}
