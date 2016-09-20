package com.crest.chainofresponsibilty;

public abstract class CrestWorkHandler {
    
    protected CrestWorkHandler nextWork;
    
    protected int worknumber;
    
    abstract void work();
    
    public void setNextResponsibilty(final CrestWorkHandler nextWork) {
        this.nextWork = nextWork;
    }
    
    public void doWork(final int worknumber) {
        if (this.worknumber <= worknumber) {
            work();
        }
        if (nextWork != null) {
            nextWork.doWork(worknumber);
        }
        
    }
}
