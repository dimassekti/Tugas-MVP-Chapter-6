package com.coufie.mvp_news_mu1.presenter

import android.widget.Toast
import com.coufie.chapterenammu1.kedua.listfilm_asynctask.network.ApiClient
import com.coufie.mvp_news_mu1.model.getAllNewsItem
import retrofit2.Call
import retrofit2.Response

class NewsPresenter(val viewnews : NewsView) {

    fun getDataNews(){

        ApiClient.instance.getAllNews()
            .enqueue(object : retrofit2.Callback<List<getAllNewsItem>>{
                override fun onResponse(
                    call: Call<List<getAllNewsItem>>,
                    response: Response<List<getAllNewsItem>>
                ) {
                    if(response.isSuccessful){
                        viewnews.onSuccess(response.message(), response.body()!!)
                    }else{
                        viewnews.onError(response.message())
                    }
                }
                override fun onFailure(call: Call<List<getAllNewsItem>>, t: Throwable) {
                    viewnews.onError(t.message!!)
                }

            })

    }

}