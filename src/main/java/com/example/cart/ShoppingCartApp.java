package com.example.cart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingCartApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("shoppingcart.xml");
        ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingcart");

        System.out.println(shoppingCart);
    }
}
