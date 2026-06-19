package com.example;

public class HelloWorld {
    public String sayHello() {
        return "Hello, CI/CD!";
    }

    // We added this main method so Docker has a starting point!
    public static void main(String[] args) {
        HelloWorld app = new HelloWorld();
        System.out.println("Docker says: " + app.sayHello());
    }
}