package com.kchmielewski.kotlin.spring.counter.model

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import org.springframework.web.context.WebApplicationContext
import java.util.concurrent.atomic.AtomicInteger

interface Counter {
    fun count(): Int

    fun visit(): Int
}

open class BaseCounter(val counter: AtomicInteger) : Counter {
    override fun count() = counter.get()

    override fun visit() = counter.incrementAndGet()
}

@Component
@Scope(WebApplicationContext.SCOPE_SESSION)
class SessionCounter(counter: AtomicInteger) : BaseCounter(counter)


@Component
class ApplicationCounter(counter: AtomicInteger) : BaseCounter(counter)