package org.example;

public class AddNumbers implements Chain{

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    public void calculate(Numbers request) {
        if(request.getCalculationWanted().equals("add") ) {
            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = "
            + (request.getNumber1() + request.getNumber2()));
        }

        else {
            nextChain.calculate(request);
        }

    }

}
