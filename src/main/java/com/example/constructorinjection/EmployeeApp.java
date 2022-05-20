package com.example.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("constructorinjectionconfig.xml");
        Employee employee = (Employee) ctx.getBean("employee");

        System.out.println(employee);
    }
}
