package com.example.demo.exRate

import java.math.BigDecimal

interface ExRateProvider {
    fun getExRate(currency: String): BigDecimal
}
