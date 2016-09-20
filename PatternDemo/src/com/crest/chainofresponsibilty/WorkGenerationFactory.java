package com.crest.chainofresponsibilty;

public class WorkGenerationFactory {
    
    public CrestWorkHandler getWork(final String typeofwork) {
        switch (typeofwork) {
            case "":
                return null;
                
            case "Regular":
                return new OfficeWork(1);
            case "Fun":
                return new FunAtWork(3);
            case "Tea":
                return new TeaWork(2);
            default:
                break;
        }
        return null;
        
    }
    
}
