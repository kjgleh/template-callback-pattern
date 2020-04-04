package com.example.demo

interface CalculatorStrategy<T> {
    fun calculate(input: String, base: T): T
}