package com.coufie.mvp_news_mu1.presenter

import com.coufie.mvp_news_mu1.model.getAllNewsItem

interface NewsView {

    fun onSuccess(pesan: String, news : List<getAllNewsItem>)
    fun onError(pesan: String)

}