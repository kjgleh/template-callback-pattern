package com.example.demo.calculator

interface CalculatorStrategy<T> {
    fun calculate(input: String, base: T): T
}
