package com.crest.factory;

public class WorkGenerationFactory {
    
    public CrestWork getWork(final String typeofwork) {
        switch (typeofwork) {
            case "":
                return null;
                
            case "Regular":
                return new OfficeWork();
            case "Fun":
                return new FunAtWork();
            default:
                break;
        }
        return null;
        
    }
    
    public static void main(final String[] args) {
        final WorkGenerationFactory factory = new WorkGenerationFactory();
        final CrestWork workClass = factory.getWork("Fun");
        workClass.work();
        final CrestWork workClass2 = factory.getWork("Regular");
        workClass2.work();
    }
}
