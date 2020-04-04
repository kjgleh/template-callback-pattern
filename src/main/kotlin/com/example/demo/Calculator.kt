package com.example.demo

import java.io.BufferedReader
import java.io.File
import java.io.IOException

class Calculator {

    fun calSum(file: String): Int {
        val calculatorStrategy = SumCalculator()
        return this.template(file, 0, calculatorStrategy)
    }

    fun calMultiply(file: String): Int {
        val calculatorStrategy = MultiplyCalculator()
        return this.template(file, 1, calculatorStrategy)
    }

    private fun template(file: String, base: Int, calculatorStrategy: CalculatorStrategy): Int {
        var result = base
        var br: BufferedReader? = null

        try {
            br = File(file).bufferedReader()
            br.forEachLine {
                result = calculatorStrategy.calculate(it.toInt(), result)
            }
        } catch (e: IOException) {
            throw e
        } finally {
            br?.close()
        }
        return result
    }
}
