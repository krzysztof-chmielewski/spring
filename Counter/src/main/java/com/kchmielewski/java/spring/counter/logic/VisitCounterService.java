package com.kchmielewski.java.spring.counter.logic;

import com.kchmielewski.java.spring.counter.model.ApplicationCounter;
import com.kchmielewski.java.spring.counter.model.Counter;
import com.kchmielewski.java.spring.counter.model.SessionCounter;
import com.kchmielewski.java.spring.counter.web.VisitCounterResponse;
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

    public VisitCounterResponse count() {
        return new VisitCounterResponse(applicationCounter.count(),
                applicationContext.getBean(SessionCounter.class).count());
    }

    public VisitCounterResponse visit() {
        return new VisitCounterResponse(applicationCounter.visit(),
                applicationContext.getBean(SessionCounter.class).visit());
    }
}
