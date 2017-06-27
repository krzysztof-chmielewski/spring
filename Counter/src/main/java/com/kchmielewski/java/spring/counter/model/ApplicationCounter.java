package com.kchmielewski.java.spring.counter.model;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class ApplicationCounter extends BaseCounter {
    public ApplicationCounter(AtomicInteger counter) {
        super(counter);
    }
}
