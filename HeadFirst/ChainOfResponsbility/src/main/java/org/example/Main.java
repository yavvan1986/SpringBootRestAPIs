package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Chain calc1 = new AddNumbers();
        Chain calc2 = new SubtractNumbers();

        calc1.setNextChain(calc2);

        Numbers request = new Numbers(4, 2, "add");
        calc1.calculate(request);

    }


}