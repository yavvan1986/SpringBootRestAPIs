package org.example;

public class SubtractNumbers implements Chain{

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    public void calculate(Numbers request) {
        if(request.getCalculationWanted().equals("sub") ) {
            System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = "
                    + (request.getNumber1() - request.getNumber2()));
        }

        else {
            System.out.println("Only add and sub are allowed at this point of this...");
        }
    }
}
