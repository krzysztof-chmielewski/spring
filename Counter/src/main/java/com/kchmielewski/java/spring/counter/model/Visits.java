package com.kchmielewski.java.spring.counter.model;

public class Visits {
    private final int totalVisits;
    private final int sessionVisits;

    public Visits(int totalVisits, int sessionVisits) {
        this.totalVisits = totalVisits;
        this.sessionVisits = sessionVisits;
    }

    public int getTotalVisits() {
        return totalVisits;
    }

    public int getSessionVisits() {
        return sessionVisits;
    }
}
