package com.kchmielewski.java.spring.counter.web;

public class VisitCounterResponse {
    private final int totalVisits;
    private final int sessionVisits;

    public VisitCounterResponse(int totalVisits, int sessionVisits) {
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
