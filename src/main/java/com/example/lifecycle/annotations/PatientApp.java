package com.example.lifecycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientApp {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycleannotationsconfig.xml");
        Patient patient = (Patient) ctx.getBean("patient");

        System.out.println(patient);

        ctx.registerShutdownHook();
    }
}
