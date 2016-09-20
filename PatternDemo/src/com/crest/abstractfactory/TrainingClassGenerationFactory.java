package com.crest.abstractfactory;

import com.crest.abstractfactory.training.CrestTraining;
import com.crest.abstractfactory.training.DocumentumTraining;
import com.crest.abstractfactory.training.JavaTraining;
import com.crest.abstractfactory.work.CrestWork;

public class TrainingClassGenerationFactory extends AbstractCrestClassFactory {
    
    @Override
    public CrestTraining getTrainingClass(final String typeofwork) {
        switch (typeofwork) {
            case "":
                return null;
                
            case "Java":
                return new JavaTraining();
            case "Documentum":
                return new DocumentumTraining();
            default:
                break;
        }
        return null;
        
    }
    
    @Override
    CrestWork getWorkClass(final String typeofwork) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
