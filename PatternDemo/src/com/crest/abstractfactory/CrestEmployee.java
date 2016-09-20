package com.crest.abstractfactory;

public class CrestEmployee {
    
    public static void main(final String[] args) {
        final AbstractCrestClassFactory trainingclass =
                FactoryClassProducer.getClassBasedOnEmployeeChoice("training");
        System.out.println("Lets go for Java training");
        trainingclass.getTrainingClass("Java").trainPeople();
        System.out.println("Lets go for Documentum training");
        trainingclass.getTrainingClass("Documentum").trainPeople();
        final AbstractCrestClassFactory workclass =
                FactoryClassProducer.getClassBasedOnEmployeeChoice("work");
        System.out.println("Lets go for Regular Work");
        workclass.getWorkClass("Regular").work();
        System.out.println("Lets go for Fun Work");
        workclass.getWorkClass("Fun").work();
        ;
        
    }
}
