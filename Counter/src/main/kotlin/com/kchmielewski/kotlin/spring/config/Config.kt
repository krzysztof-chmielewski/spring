package com.kchmielewski.kotlin.spring.config

import com.kchmielewski.kotlin.spring.counter.CounterConfig
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Import(CounterConfig::class)
@Configuration
open class Config