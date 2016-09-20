package com.crest.chainofresponsibilty;

public class FunAtWork extends CrestWorkHandler {
    
    @Override
    public void work() {
        System.out.println("FunAtWork.work()- Doing fun at work");
        
    }
    
    public FunAtWork(final int workNum) {
        this.worknumber = workNum;
    }
    
}
