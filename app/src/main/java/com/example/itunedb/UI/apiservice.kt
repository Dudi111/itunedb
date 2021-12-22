package com.example.itunedb.UI

import com.example.itunedb.data.ResponseModel
import com.example.itunedb.data.Result
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface apiservice {
    @GET("search")
    suspend fun posts(@Query("term")Id:String): Response<Result>
}