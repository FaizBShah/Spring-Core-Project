package com.example.lifecycle.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientApp {
    public static void main(String[] args) {
        // To invoke the destroy() method, we need to use the registerShutdownHook()
        // This function is only available in the AbstractApplicationContext, so we need
        // to import this class.
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("lifecyclexmlconfig.xml");
        Patient patient = (Patient) ctx.getBean("patient");

        System.out.println(patient);

        // Calling this function to tell Application Context to register the destroy() hook
        ctx.registerShutdownHook();
    }
}
