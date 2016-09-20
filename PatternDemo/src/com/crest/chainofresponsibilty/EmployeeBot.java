package com.crest.chainofresponsibilty;

/**
 * This class is responsible for working out chain of responsibilty using the factory methods defien
 * below
 * 
 * @author Rajesh Ghosh
 */

public class EmployeeBot {
    
    private static CrestWorkHandler getChainOfWork() {
        final WorkGenerationFactory factory = new WorkGenerationFactory();
        final CrestWorkHandler funWork = factory.getWork("Fun");
        final CrestWorkHandler regularWork = factory.getWork("Regular");
        final CrestWorkHandler teawork = factory.getWork("Tea");
        regularWork.setNextResponsibilty(teawork);
        teawork.setNextResponsibilty(funWork);
        return regularWork;
        
    }
    
    public static void main(final String[] args) {
        final CrestWorkHandler chainofwork = getChainOfWork();
        /*
         * Its is regular work with set Next resposibility as teawork
         */
        chainofwork.doWork(3);
    }
}
