package com.example.demo.exRate

import java.math.BigDecimal
import org.springframework.stereotype.Service

@Service
class WebApiExRateProvider(
    private val apiTemplate: ApiTemplate,
    private val apiExecutor: ApiExecutor,
    private val exRateExtractor: ExRateExtractor,
) : ExRateProvider {

    override fun getExRate(currency: String): BigDecimal {
        val url = "https://open.er-api.com/v6/latest/$currency"

        return apiTemplate.getForExRate(url, apiExecutor, exRateExtractor)
    }
}
