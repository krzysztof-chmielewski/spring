package com.kchmielewski.java.spring.counter.logic;

import com.kchmielewski.java.spring.counter.model.ApplicationCounter;
import com.kchmielewski.java.spring.counter.model.Counter;
import com.kchmielewski.java.spring.counter.model.SessionCounter;
import com.kchmielewski.java.spring.counter.model.Visits;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class VisitCounterService {
    private final ApplicationContext applicationContext;
    private final Counter applicationCounter;

    public VisitCounterService(ApplicationContext applicationContext, ApplicationCounter counter) {
        this.applicationContext = applicationContext;
        applicationCounter = counter;
    }

    public Visits count() {
        return new Visits(applicationCounter.count(), applicationContext.getBean(SessionCounter.class).count());
    }

    public Visits visit() {
        return new Visits(applicationCounter.visit(), applicationContext.getBean(SessionCounter.class).visit());
    }
}
