package com.kchmielewski.spring.counter.web;

import com.kchmielewski.spring.counter.logic.VisitCounterService;
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
    public VisitCounterResponse home() {
        return counterService.visit();
    }
}
