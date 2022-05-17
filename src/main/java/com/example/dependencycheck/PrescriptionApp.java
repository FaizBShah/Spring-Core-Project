package com.example.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrescriptionApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dependencycheckconfig.xml");
        Prescription prescription = (Prescription) ctx.getBean("prescription");

        System.out.println(prescription);
    }
}
