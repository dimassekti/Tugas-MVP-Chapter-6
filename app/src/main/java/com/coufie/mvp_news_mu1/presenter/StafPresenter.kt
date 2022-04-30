package com.coufie.mvp_news_mu1.presenter

import com.coufie.chapterenammu1.kedua.listfilm_asynctask.network.ApiClient
import com.coufie.mvp_news_mu1.model.getAllStaffItem
import retrofit2.Call
import retrofit2.Response


class StafPresenter(val viewstafs : StafView) {

    fun getDataStafs(){

        ApiClient.instance.getAllStaf()
            .enqueue(object : retrofit2.Callback<List<getAllStaffItem>>{
                override fun onResponse(
                    call: Call<List<getAllStaffItem>>,
                    response: Response<List<getAllStaffItem>>
                ) {
                    if(response.isSuccessful){
                        viewstafs.onSuccess(response.message(), response.body()!!)
                    }else{
                        viewstafs.onError(response.message())
                    }
                }
                override fun onFailure(call: Call<List<getAllStaffItem>>, t: Throwable) {
                    viewstafs.onError(t.message!!)
                }

            })

    }

}