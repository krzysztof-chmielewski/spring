package com.kchmielewski.kotlin.spring.core

import com.kchmielewski.kotlin.spring.counter.CounterConfig
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

/**
 * Main configuration class.
 */
@Import(CounterConfig::class)
@Configuration
open class Config