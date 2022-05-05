package com.example.lifecycle.xmlconfig;

public class Patient {
    private int id;

    public void hi() {
        System.out.println("Inside Init() Method");
    }

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
