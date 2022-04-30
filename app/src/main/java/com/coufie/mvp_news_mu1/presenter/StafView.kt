package com.coufie.mvp_news_mu1.presenter

import com.coufie.mvp_news_mu1.model.getAllStaffItem

interface StafView {

    fun onSuccess(pesan: String, stafs : List<getAllStaffItem>)
    fun onError(pesan: String)
}