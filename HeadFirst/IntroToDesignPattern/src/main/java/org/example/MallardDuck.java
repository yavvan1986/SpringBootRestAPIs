package org.example;

public class MallardDuck extends Duck {

    public void MallardDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FLyWithWings();

    }

    public void display() {

        System.out.println("I'm a real Mallard duck... ");
    }

}
