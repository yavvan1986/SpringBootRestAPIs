package org.example;

public abstract class Duck {

    FlyBehaviour flyBehavior;
    QuackBehavior quackBehavior;


    public void setFlyBehavior(FlyBehaviour flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();

    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All Ducks float, even decoys!!!");
    }
}

