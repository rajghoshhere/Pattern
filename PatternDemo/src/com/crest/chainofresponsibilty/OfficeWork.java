package com.crest.chainofresponsibilty;

public class OfficeWork extends CrestWorkHandler {
    
    @Override
    public void work() {
        System.out.println("OfficeWork.work() - Doing office Work");
    }
    
    public OfficeWork(final int worknum) {
        this.worknumber = worknum;
    }
    
}
