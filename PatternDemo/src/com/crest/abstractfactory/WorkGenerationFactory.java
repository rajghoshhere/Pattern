package com.crest.abstractfactory;

import com.crest.abstractfactory.training.CrestTraining;
import com.crest.abstractfactory.work.CrestWork;
import com.crest.abstractfactory.work.FunAtWork;
import com.crest.abstractfactory.work.OfficeWork;

public class WorkGenerationFactory extends AbstractCrestClassFactory {
    
    @Override
    CrestWork getWorkClass(final String typeofwork) {
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
    
    @Override
    CrestTraining getTrainingClass(final String typeofwork) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
