package com.kchmielewski.java.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Application entry point.
 */
@SpringBootApplication
@Import(Config.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
