package com.kchmielewski.spring.counter.model;

import java.util.concurrent.atomic.AtomicInteger;

public class BaseCounter implements Counter {
    private final AtomicInteger counter;

    public BaseCounter(AtomicInteger counter) {
        this.counter = counter;
    }

    @Override
    public int count() {
        return counter.get();
    }

    @Override
    public int visit() {
        return counter.incrementAndGet();
    }
}
