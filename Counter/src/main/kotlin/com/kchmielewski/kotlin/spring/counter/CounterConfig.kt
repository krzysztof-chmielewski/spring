package com.kchmielewski.kotlin.spring.counter

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope
import java.util.concurrent.atomic.AtomicInteger

/**
 * Configuration for counter scope.
 */
@Configuration
@ComponentScan(basePackageClasses = arrayOf(CounterConfig::class))
open class CounterConfig {

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    open fun atomicInteger() = AtomicInteger()
}
