package com.kchmielewski.kotlin.spring.counter.logic

import com.kchmielewski.kotlin.spring.counter.model.ApplicationCounter
import com.kchmielewski.kotlin.spring.counter.model.SessionCounter
import com.kchmielewski.kotlin.spring.counter.web.VisitCounterResponse
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Service

@Service
class VisitCounterService(val applicationContext: ApplicationContext, val applicationCounter: ApplicationCounter) {
    fun count(): VisitCounterResponse = VisitCounterResponse(applicationCounter.count(),
            applicationContext.getBean(SessionCounter::class.java).count())

    fun visit(): VisitCounterResponse = VisitCounterResponse(applicationCounter.visit(),
            applicationContext.getBean(SessionCounter::class.java).visit())
}
