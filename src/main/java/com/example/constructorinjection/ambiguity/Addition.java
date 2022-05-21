package com.example.constructorinjection.ambiguity;

public class Addition {

    Addition(double a, double b) {
        System.out.println("Inside constructor Double");
    }

    Addition(int a, int b) {
        System.out.println("Inside constructor Int");
    }

    Addition(String a, String b) {
        System.out.println("Inside constructor String");
    }
}
