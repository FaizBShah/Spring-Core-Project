package com.example.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("innerbeansconfig.xml");

        // Spring uses Singleton Scoping by default
        // which means that no matter how many times
        // you call a particular bean, it will always return the
        // same object/instance.
        Employee employee1 = (Employee) ctx.getBean("employee");
        System.out.println(employee1.hashCode());

        Employee employee2 = (Employee) ctx.getBean("employee");
        System.out.println(employee2.hashCode());
    }
}
