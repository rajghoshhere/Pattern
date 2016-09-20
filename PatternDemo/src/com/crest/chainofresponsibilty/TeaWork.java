package com.crest.chainofresponsibilty;

public class TeaWork extends CrestWorkHandler {
    
    @Override
    public void work() {
        System.out.println("Teawork.work() - DrinkingTea in office ");
    }
    
    public TeaWork(final int worknum) {
        this.worknumber = worknum;
    }
}
