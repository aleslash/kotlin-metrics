package com.alexast

import javax.inject.Singleton

class BackendService {

    fun transact(trancode: String): String {
        return "RESP-$trancode"
    }
}