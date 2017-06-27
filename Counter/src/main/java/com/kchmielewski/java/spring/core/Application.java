package com.kchmielewski.java.spring.core;

import com.kchmielewski.java.spring.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(Config.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
