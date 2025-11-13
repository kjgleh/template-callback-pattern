package com.example.demo.exRate

import java.math.BigDecimal

interface ExRateExtractor {
    fun extract(response: String): BigDecimal
}
