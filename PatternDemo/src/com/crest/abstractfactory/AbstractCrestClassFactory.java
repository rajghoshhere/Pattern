package com.crest.abstractfactory;

import com.crest.abstractfactory.training.CrestTraining;
import com.crest.abstractfactory.work.CrestWork;

public abstract class AbstractCrestClassFactory {
    
    abstract CrestWork getWorkClass(final String typeofwork);
    
    abstract CrestTraining getTrainingClass(final String typeoftraining);
    
}
