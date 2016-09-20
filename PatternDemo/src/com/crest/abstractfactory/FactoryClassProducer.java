package com.crest.abstractfactory;

public class FactoryClassProducer {
    
    public static AbstractCrestClassFactory getClassBasedOnEmployeeChoice(final String typeofwork) {
        if (typeofwork == "training") {
            return new TrainingClassGenerationFactory();
        } else if (typeofwork == "work") {
            return new WorkGenerationFactory();
        }
        return null;
        
    }
}
