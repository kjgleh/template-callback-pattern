package com.example.demo.exRate

import java.net.URI
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Primary
@Service
class SimpleApiExecutor : ApiExecutor {

    override fun execute(uri: URI): String {
        TODO("Not yet implemented")
    }
}
