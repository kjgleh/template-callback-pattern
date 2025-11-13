package com.example.demo.exRate

import java.math.BigDecimal
import org.springframework.stereotype.Service

@Service
class SimpleExRateExtractor : ExRateExtractor {

    override fun extract(response: String): BigDecimal {
        TODO("Not yet implemented")
    }

}
