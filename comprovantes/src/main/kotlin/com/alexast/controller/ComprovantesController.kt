package com.alexast.controller

import com.alexast.model.Comprovante
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Maybe

@Controller("/comprovantes")
class ComprovantesController {
    @Get()
    fun listComprovantes() : List<Comprovante> {
        val comprovante = Comprovante();
        val listaComprovante = listOf<Comprovante>(comprovante)
        return listaComprovante;
    }
}