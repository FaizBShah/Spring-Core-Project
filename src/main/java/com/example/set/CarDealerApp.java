package com.example.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDealerApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("setconfig.xml");
        CarDealer carDealer = (CarDealer) ctx.getBean("cardealer");

        System.out.println(carDealer.getName());
        System.out.println(carDealer.getModels());
    }
}
