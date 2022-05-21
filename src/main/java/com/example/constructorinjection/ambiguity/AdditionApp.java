package com.example.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ambiguityconfig.xml");
        Addition addition = (Addition) ctx.getBean("addition");

        System.out.println(addition);
    }
}
