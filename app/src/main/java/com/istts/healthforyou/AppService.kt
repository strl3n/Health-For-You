package com.istts.healthforyou

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface AppService {
    @POST("api/v1/auth/register")
    suspend fun registerUser(@Body user: EntityUser): AppResponse

    @POST("api/vi/auth/login")
    suspend fun loginUser(@Body user: EntityUser): AppResponse
}
