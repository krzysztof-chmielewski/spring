package com.kchmielewski.java.spring.core;

import com.kchmielewski.java.spring.counter.CounterConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Main configuration class.
 */
@Configuration
@Import(CounterConfig.class)
public class Config {
}
