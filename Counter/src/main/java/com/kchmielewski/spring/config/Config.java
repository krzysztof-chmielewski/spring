package com.kchmielewski.spring.config;

import com.kchmielewski.spring.counter.CounterConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CounterConfig.class)
public class Config {
}
