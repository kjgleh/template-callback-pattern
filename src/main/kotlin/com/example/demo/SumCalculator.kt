package com.example.demo

class SumCalculator: CalculatorStrategy {
    override fun calculate(input: Int, base: Int): Int {
        return base + input
    }
}