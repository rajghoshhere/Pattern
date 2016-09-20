package com.crest.abstractfactory.work;

public class OfficeWork implements CrestWork {
    
    @Override
    public void work() {
        System.out.println("OfficeWork.work() - Doing office Work");
    }
    
}
