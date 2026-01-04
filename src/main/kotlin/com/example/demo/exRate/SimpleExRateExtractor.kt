package com.example.demo.exRate

import java.math.BigDecimal
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Primary
@Service
class SimpleExRateExtractor : ExRateExtractor {

    override fun extract(response: String): BigDecimal {
        TODO("Not yet implemented")
    }

}
