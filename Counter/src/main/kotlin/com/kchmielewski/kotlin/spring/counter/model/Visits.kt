package com.kchmielewski.kotlin.spring.counter.model

/**
 * Value object representing [totalVisits] (as well as [sessionVisits]) at some resource.
 */
class Visits(val totalVisits: Int, val sessionVisits: Int)