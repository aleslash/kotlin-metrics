package com.alexast

import io.grpc.ManagedChannel
import java.io.Closeable
import java.util.concurrent.TimeUnit

class BackendClient(private val channel: ManagedChannel) : Closeable {

    private val stub: BackendServiceGrpcKt.BackendServiceCoroutineStub = BackendServiceGrpcKt.BackendServiceCoroutineStub(channel)

    suspend fun transact(trancode: String) : String {
        val request = BackendRequest.newBuilder().setTrancode(trancode).build()
        val response = stub.sendTransaction(request)
        return response.trancode
    }

    override fun close() {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS)
    }

}