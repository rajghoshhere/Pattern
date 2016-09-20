package com.crest.observer;

import java.util.ArrayList;
import java.util.List;

public class Meeting {
    
    public List<ProjectObserver> genericobserver = new ArrayList<ProjectObserver>();
    
    // The day on which we need the update to happen
    private int date;
    
    public int getDate() {
        return date;
    }
    
    public void setDate(final int date) {
        this.date = date;
        notifyAllProject();
    }
    
    private void notifyAllProject() {
        for (final ProjectObserver observer : genericobserver) {
            observer.updateStatus();
        }
    }
    
    public void addProject(final ProjectObserver observer) {
        genericobserver.add(observer);
    }
    
}
