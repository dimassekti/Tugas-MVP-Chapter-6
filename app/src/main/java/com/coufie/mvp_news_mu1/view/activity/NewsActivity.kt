package com.coufie.mvp_news_mu1.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.coufie.mvp_news_mu1.R
import com.coufie.mvp_news_mu1.model.getAllNewsItem
import com.coufie.mvp_news_mu1.presenter.NewsPresenter
import com.coufie.mvp_news_mu1.presenter.NewsView
import com.coufie.mvp_news_mu1.view.adapter.NewsAdapter
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity(), NewsView {

    //    lateinit var adapternews : NewsAdapter
    private lateinit var presenternews : NewsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        presenternews = NewsPresenter(this)
        presenternews.getDataNews()
    }


    override fun onSuccess(pesan: String, news: List<getAllNewsItem>) {
        rv_news.layoutManager = LinearLayoutManager(this)
        rv_news.adapter = NewsAdapter(news)

    }

    override fun onError(pesan: String) {
        Toast.makeText(this, pesan, Toast.LENGTH_LONG).show()
    }
}