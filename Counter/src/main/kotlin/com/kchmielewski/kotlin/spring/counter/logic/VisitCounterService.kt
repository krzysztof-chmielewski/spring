package com.kchmielewski.kotlin.spring.counter.logic

import com.kchmielewski.kotlin.spring.counter.model.ApplicationCounter
import com.kchmielewski.kotlin.spring.counter.model.SessionCounter
import com.kchmielewski.kotlin.spring.counter.model.Visits
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Service

@Service
class VisitCounterService(private val applicationContext: ApplicationContext,
                          private val applicationCounter: ApplicationCounter) {

    fun count(): Visits = Visits(applicationCounter.count(),
            applicationContext.getBean(SessionCounter::class.java).count())

    fun visit(): Visits = Visits(applicationCounter.visit(),
            applicationContext.getBean(SessionCounter::class.java).visit())
}
