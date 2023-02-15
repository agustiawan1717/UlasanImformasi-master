package com.kotlin.agustiawan.repository.api

import androidx.lifecycle.LiveData
import com.kotlin.agustiawan.repository.api.network.Resource
import com.kotlin.agustiawan.repository.model.informasi.NewsSource
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiServices {
    @GET("top-headlines")
    fun getNewsSource(@QueryMap options: Map<String, String>): LiveData<Resource<NewsSource>>

}
