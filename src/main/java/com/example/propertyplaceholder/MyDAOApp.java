package com.example.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDAOApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("propertyplaceholderconfig.xml");
        MyDAO myDAO = (MyDAO) ctx.getBean("MyDAO");

        System.out.println(myDAO);
    }
}
