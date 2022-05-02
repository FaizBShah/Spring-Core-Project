package com.example.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountriesAndLanguagesApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("propertiesconfig.xml");
        CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) ctx.getBean("countriesAndLangs");

        System.out.println(countriesAndLanguages);
    }
}
