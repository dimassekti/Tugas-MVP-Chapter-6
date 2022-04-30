package com.coufie.chapterenammu1.kedua.listfilm_asynctask.network

import com.coufie.mvp_news_mu1.model.getAllNewsItem
import com.coufie.mvp_news_mu1.model.getAllStaffItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("news")
    fun getAllNews() : Call<List<getAllNewsItem>>

    @GET("staf")
    fun getAllStaf() : Call<List<getAllStaffItem>>
}
