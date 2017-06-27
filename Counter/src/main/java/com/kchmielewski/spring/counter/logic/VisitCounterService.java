package com.kchmielewski.spring.counter.logic;

import com.kchmielewski.spring.counter.model.ApplicationCounter;
import com.kchmielewski.spring.counter.model.SessionCounter;
import com.kchmielewski.spring.counter.web.VisitCounterResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class VisitCounterService {
    private final ApplicationContext applicationContext;

    public VisitCounterService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public VisitCounterResponse count() {
        return new VisitCounterResponse(applicationContext.getBean(ApplicationCounter.class).count(),
                applicationContext.getBean(SessionCounter.class).count());
    }

    public VisitCounterResponse visit() {
        return new VisitCounterResponse(applicationContext.getBean(ApplicationCounter.class).visit(),
                applicationContext.getBean(SessionCounter.class).visit());
    }
}
