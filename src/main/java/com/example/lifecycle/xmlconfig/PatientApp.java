package com.example.lifecycle.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        Patient patient = (Patient) ctx.getBean("patient");

        System.out.println(patient);
    }
}
