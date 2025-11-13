package com.example.demo.exRate

import java.net.URI

interface ApiExecutor {
    fun execute(uri: URI): String
}
