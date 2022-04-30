package com.coufie.mvp_news_mu1.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.coufie.mvp_news_mu1.R
import com.coufie.mvp_news_mu1.model.getAllStaffItem
import com.coufie.mvp_news_mu1.presenter.StafPresenter
import com.coufie.mvp_news_mu1.presenter.StafView
import com.coufie.mvp_news_mu1.view.adapter.StafAdapter
import kotlinx.android.synthetic.main.activity_staf.*

class StafActivity : AppCompatActivity(), StafView {

    private lateinit var presenterstafs : StafPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staf)

        presenterstafs = StafPresenter(this)
        presenterstafs.getDataStafs()

    }

    override fun onSuccess(pesan: String, stafs: List<getAllStaffItem>) {
        rv_staf.layoutManager = LinearLayoutManager(this)
        rv_staf.adapter = StafAdapter(stafs)
    }

    override fun onError(pesan: String) {
        Toast.makeText(this, pesan, Toast.LENGTH_LONG).show()
    }
}