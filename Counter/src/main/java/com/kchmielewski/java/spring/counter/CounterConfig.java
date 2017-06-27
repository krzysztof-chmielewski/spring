package com.kchmielewski.java.spring.counter;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.concurrent.atomic.AtomicInteger;

@Configuration
@ComponentScan(basePackageClasses = CounterConfig.class)
public class CounterConfig {

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    public AtomicInteger atomicInteger() {
        return new AtomicInteger();
    }
}
