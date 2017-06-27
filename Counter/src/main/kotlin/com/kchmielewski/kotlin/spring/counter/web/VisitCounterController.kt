package com.kchmielewski.kotlin.spring.counter.web

import com.kchmielewski.kotlin.spring.counter.logic.VisitCounterService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VisitCounterController(private val counterService: VisitCounterService) {
    @GetMapping(path = arrayOf(""))
    fun home() = counterService.visit()
}
