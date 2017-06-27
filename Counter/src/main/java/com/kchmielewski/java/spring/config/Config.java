package com.kchmielewski.java.spring.config;

import com.kchmielewski.java.spring.counter.CounterConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CounterConfig.class)
public class Config {
}
