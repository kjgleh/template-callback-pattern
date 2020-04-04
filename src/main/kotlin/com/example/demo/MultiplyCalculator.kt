package com.example.demo

class MultiplyCalculator: CalculatorStrategy {
    override fun calculate(input: Int, base: Int): Int {
        return base * input
    }
}