package com.kchmielewski.java.spring.counter.model;

/**
 * Counter represents current state of visits at some resource.
 *
 * Counter instances are guaranteed be threadsafe.
 */
public interface Counter {
    /**
     * Returns current visiting count without incrementing it.
     */
    int count();

    /**
     * Increment a visiting count and returns new value.
     */
    int visit();
}
