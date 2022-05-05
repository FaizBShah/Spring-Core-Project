package com.example.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    private int id;

    @PostConstruct
    public void hi() {
        System.out.println("Inside Init() Method");
    }

    @PreDestroy
    public void bye() {
        System.out.println("Inside Destroy() Method");
    }

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
}
