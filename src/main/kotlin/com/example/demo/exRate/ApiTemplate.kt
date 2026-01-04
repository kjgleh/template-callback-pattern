package com.example.demo.exRate

import java.math.BigDecimal
import java.net.URI
import org.springframework.stereotype.Service

@Service
class ApiTemplate(
    private val apiExecutor: ApiExecutor,
    private val exRateExtractor: ExRateExtractor,
) {

    fun getForExRate(
        url: String,
        apiExecutor: ApiExecutor = this.apiExecutor,
        exRateExtractor: ExRateExtractor = this.exRateExtractor,
    ): BigDecimal {
        val uri = URI.create(url)
        val response = apiExecutor.execute(uri)

        return exRateExtractor.extract(response)
    }

}
