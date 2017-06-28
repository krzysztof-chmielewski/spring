package com.kchmielewski.kotlin.spring.core

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(Config::class)
open class Application

/**
 * Application entry point.
 */
fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
