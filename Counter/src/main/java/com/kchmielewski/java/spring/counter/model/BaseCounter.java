package com.kchmielewski.java.spring.counter.model;

import java.util.concurrent.atomic.AtomicInteger;

class BaseCounter implements Counter {
    private final AtomicInteger counter;

    BaseCounter(AtomicInteger counter) {
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
