package com.coufie.mvp_news_mu1.view.activity

import android.app.ProgressDialog
import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coufie.mvp_news_mu1.R
import com.coufie.mvp_news_mu1.model.getAllNewsItem
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_news.setOnClickListener {
            startActivity(Intent(this, NewsActivity::class.java))
        }

        btn_staf.setOnClickListener {
            startActivity(Intent(this, StafActivity::class.java))
        }

//        asyncNews().execute()

    }



    inner class asyncNews : AsyncTask<Void, Void, List<getAllNewsItem>>(){

        lateinit var pdialog : ProgressDialog

        override fun onPreExecute() {
            super.onPreExecute()

//            pdialog = ProgressDialog(this@MainActivity)
//            pdialog.setMessage("Menampilkan list berita")
//            pdialog.show()

        }

        override fun doInBackground(vararg p0: Void?): List<getAllNewsItem>? {
//
//            presenternews = NewsPresenter(this@MainActivity)
//            presenternews.getDataNews()

            return null

        }

        override fun onPostExecute(result: List<getAllNewsItem>?) {
            super.onPostExecute(result)

//            rv_news.layoutManager = LinearLayoutManager(this@MainActivity)
//            rv_news.adapter = NewsAdapter(news)

        }
    }



}