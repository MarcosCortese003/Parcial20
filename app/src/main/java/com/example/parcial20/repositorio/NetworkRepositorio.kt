package com.example.parcial20.repositorio

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.http.HttpStatusCode
import io.ktor.http.buildUrl



class NetworkRepositorio : Repositorio {

    private val clima = HttpClient(){
install(ContentNegotiation)//minuto 49:12
    }

    override suspend fun getClima(): String {
    val respuesta= clima.get("Api")

        if (respuesta.status== HttpStatusCode.OK) { return "1213"
        }else{
            throw Exception()
        }


    }
}
