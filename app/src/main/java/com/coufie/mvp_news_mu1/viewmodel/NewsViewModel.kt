package com.coufie.mvp_news_mu1.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.coufie.chapterenammu1.kedua.listfilm_asynctask.network.ApiClient
import com.coufie.mvp_news_mu1.model.getAllNewsItem
import retrofit2.Call
import retrofit2.Response


class NewsViewModel : ViewModel() {

    lateinit var filmLiveData : MutableLiveData<List<getAllNewsItem>>

    init {
        filmLiveData = MutableLiveData()
    }

    fun getFilmLLD() : MutableLiveData<List<getAllNewsItem>>{
        return filmLiveData
    }

    fun callFilmApi(){
        ApiClient.instance.getAllNews()
            .enqueue(object : retrofit2.Callback<List<getAllNewsItem>>{
                override fun onResponse(
                    call: Call<List<getAllNewsItem>>,
                    response: Response<List<getAllNewsItem>>
                ) {
                    if(response.isSuccessful){
                        filmLiveData.postValue(response.body())
                    }else{
                        filmLiveData.postValue(null)
                    }
                }

                override fun onFailure(call: Call<List<getAllNewsItem>>, t: Throwable) {
                    filmLiveData.postValue(null)
                }


            })
    }


}