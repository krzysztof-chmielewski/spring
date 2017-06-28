package com.kchmielewski.java.spring.counter.web;

import com.kchmielewski.java.spring.counter.logic.VisitCounterService;
import com.kchmielewski.java.spring.counter.model.Visits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitCounterController {
    private VisitCounterService counterService;

    @Autowired
    public VisitCounterController(VisitCounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping(path = "")
    public Visits home() {
        return counterService.visit();
    }

    @GetMapping(path = "count")
    public Visits count() {
        return counterService.count();
    }
}
