package com.kchmielewski.kotlin.spring.counter.model

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import org.springframework.web.context.WebApplicationContext
import java.util.concurrent.atomic.AtomicInteger

/**
 * Counter represents current state of visits at some resource.
 *
 * Counter instances are guaranteed be threadsafe.
 */
interface Counter {
    /**
     * Returns current visiting count without incrementing it.
     */
    fun count(): Int

    /**
     * Increment a visiting count and returns new value.
     */
    fun visit(): Int
}

/**
 * Skeleton implementation of the [Counter] interface.
 */
abstract class BaseCounter(private val counter: AtomicInteger) : Counter {
    override fun count() = counter.get()

    override fun visit() = counter.incrementAndGet()
}

@Component
@Scope(WebApplicationContext.SCOPE_SESSION)
class SessionCounter(counter: AtomicInteger) : BaseCounter(counter)


@Component
class ApplicationCounter(counter: AtomicInteger) : BaseCounter(counter)