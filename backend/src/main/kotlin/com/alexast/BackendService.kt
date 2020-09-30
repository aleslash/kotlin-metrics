package com.alexast

import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import javax.inject.Singleton

@Factory
class BackendService {

    @Bean
    fun transact(trancode: String): String {
        return "RESP-$trancode"
    }
}