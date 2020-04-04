package com.example.demo

import java.io.BufferedReader
import java.io.File
import java.io.IOException

class Calculator {

    fun calSum(file: String): Int {
        var result = 0
        var br: BufferedReader? = null

        try {
            br = File(file).bufferedReader()
            br.forEachLine {
                result += it.toInt()
            }
        } catch (e: IOException) {
            throw e
        } finally {
            br?.close()
        }

        return result
    }

    fun calMultiply(file: String): Int {
        var result = 1
        var br: BufferedReader? = null

        try {
            br = File(file).bufferedReader()
            br.forEachLine {
                result *= it.toInt()
            }
        } catch (e: IOException) {
            throw e
        } finally {
            br?.close()
        }

        return result
    }
}
