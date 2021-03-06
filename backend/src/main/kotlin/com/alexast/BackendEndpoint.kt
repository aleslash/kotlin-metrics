package com.alexast

import javax.inject.Singleton

@Singleton
class BackendEndpoint(val backendService: BackendService) :
        BackendServiceGrpcKt.BackendServiceCoroutineImplBase() {
    override suspend fun sendTransaction(request: BackendRequest): BackendReply {
        val trancode = backendService.transact(request.trancode)
        val reply = BackendReply.newBuilder().setTrancode(trancode).build()
        return reply
    }
}