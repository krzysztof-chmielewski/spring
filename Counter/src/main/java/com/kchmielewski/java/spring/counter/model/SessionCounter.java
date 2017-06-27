package com.kchmielewski.java.spring.counter.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@Scope(WebApplicationContext.SCOPE_SESSION)
public class SessionCounter extends BaseCounter {
    public SessionCounter(AtomicInteger counter) {
        super(counter);
    }
}
