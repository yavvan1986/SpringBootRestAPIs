package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile() {
        System.out.println("Working on 404 bugs but faster");
    }

}
