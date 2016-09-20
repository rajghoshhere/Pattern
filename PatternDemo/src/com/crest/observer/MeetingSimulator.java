package com.crest.observer;

public class MeetingSimulator {
    
    public static void main(final String[] args) {
        final Meeting mondaymeeting = new Meeting();
        // Rupesh
        new BfluxObserver(mondaymeeting);
        System.out.println("Gettin update for day: 17");
        mondaymeeting.setDate(17);
        // Dhiren
        new JfluxObserver(mondaymeeting);
        
        System.out.println("Gettin update for day: 15");
        mondaymeeting.setDate(15);
        // surender
        new ACDCObserver(mondaymeeting);
        
        System.out.println("Gettin update for day: 12");
        mondaymeeting.setDate(12);
        
    }
}