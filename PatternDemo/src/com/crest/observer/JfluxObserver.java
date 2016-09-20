package com.crest.observer;

public class JfluxObserver extends ProjectObserver {
    
    public JfluxObserver(final Meeting meeting) {
        this.meeting = meeting;
        this.meeting.addProject(this);
    }
    
    @Override
    public void updateStatus() {
        System.out.println(" And the update from Jflux project for the day" + meeting.getDate());
        
    }
    
}
