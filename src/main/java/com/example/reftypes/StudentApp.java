package com.example.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("refconfig.xml");
        Student student = (Student) ctx.getBean("student");

        System.out.println(student);
    }
}
