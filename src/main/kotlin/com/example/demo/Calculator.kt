package com.example.demo

import java.io.BufferedReader
import java.io.File
import java.io.IOException

class Calculator {

    fun calSum(file: String): Int {
        val calculatorStrategy = object : CalculatorStrategy<Int> {
            override fun calculate(input: String, base: Int): Int {
                return base + input.toInt()
            }
        }
        return this.template(file, 0, calculatorStrategy)
    }

    fun calMultiply(file: String): Int {
        val calculatorStrategy = object : CalculatorStrategy<Int> {
            override fun calculate(input: String, base: Int): Int {
                return base * input.toInt()
            }
        }
        return this.template(file, 1, calculatorStrategy)
    }

    private fun <T> template(file: String, base: T, calculatorStrategy: CalculatorStrategy<T>): T {
        var result = base
        var br: BufferedReader? = null

        try {
            br = File(file).bufferedReader()
            br.forEachLine {
                result = calculatorStrategy.calculate(it, result)
            }
        } catch (e: IOException) {
            throw e
        } finally {
            br?.close()
        }
        return result
    }
}
