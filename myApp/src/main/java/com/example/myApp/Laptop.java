package com.example.myApp;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile()
    {
        System.out.println("Working on 404 bugs");
    }
}
