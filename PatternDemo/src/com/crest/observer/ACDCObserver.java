package com.crest.observer;

public class ACDCObserver extends ProjectObserver {
    
    public ACDCObserver(final Meeting meeting) {
        this.meeting = meeting;
        this.meeting.addProject(this);
    }
    
    @Override
    public void updateStatus() {
        System.out.println(" And the update from ACDC project for the day " + meeting.getDate());
        
    }
    
}
