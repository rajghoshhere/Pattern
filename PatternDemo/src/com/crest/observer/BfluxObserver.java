package com.crest.observer;

public class BfluxObserver extends ProjectObserver {
    
    public BfluxObserver(final Meeting meeting) {
        this.meeting = meeting;
        this.meeting.addProject(this);
    }
    
    @Override
    public void updateStatus() {
        System.out.println(" And the update from BFLUX project for the day" + meeting.getDate());
        
    }
    
}
