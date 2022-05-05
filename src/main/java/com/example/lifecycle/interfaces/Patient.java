package com.example.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside Setter Method");
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }

    // Acts as init() method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertiesSet()");
    }

    // Acts as destroy() method
    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy() method");
    }
}
