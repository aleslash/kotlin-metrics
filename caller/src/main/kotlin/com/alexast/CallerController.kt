package com.alexast

import io.grpc.ManagedChannelBuilder
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/valendo")
class CallerController {
    @Get()
    suspend fun chamaBackend() : String {
        val trancode:String = "teste 1";
        val channel = ManagedChannelBuilder.forAddress("localhost",8081).usePlaintext().build()
        val backendService = BackendServiceGrpcKt.BackendServiceCoroutineStub(channel)

        val request = BackendRequest.newBuilder().setTrancode(trancode).build()
        val response = backendService.sendTransaction(request)
        return response.toString()
    }

}