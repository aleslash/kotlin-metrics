package com.alexast

import io.grpc.ManagedChannel
import io.grpc.stub.AbstractAsyncStub
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import javax.inject.Singleton

@Factory
class Clients {
    @Singleton
    fun reactiveStub(channel: ManagedChannel) : BackendServiceGrpc.BackendServiceStub {
        return BackendServiceGrpc.newStub(channel)
    }
}