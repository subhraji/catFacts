package com.example.catfacts.model.network

import com.example.catfacts.model.pojo.random_facts.RandomFacts
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("/facts/random")
    suspend fun getCatFacts(): Response<RandomFacts>
}