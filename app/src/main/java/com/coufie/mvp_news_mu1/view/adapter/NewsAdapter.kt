package com.coufie.mvp_news_mu1.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.coufie.mvp_news_mu1.R
import com.coufie.mvp_news_mu1.model.getAllNewsItem
import kotlinx.android.synthetic.main.item_news.view.*


class NewsAdapter(private var dataNews : List<getAllNewsItem>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val UiNews = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news , parent, false)

        return ViewHolder(UiNews)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_title.text = dataNews!![position].title
        holder.itemView.tv_createdAt.text = dataNews!![position].createdAt
        holder.itemView.tv_author.text = dataNews!![position].author

        this.let {
            Glide.with(holder.itemView.context).load(dataNews!![position].image).into(holder.itemView.iv_image)
        }

    }

    override fun getItemCount(): Int {
        if(dataNews == null){
            return 0
        }else{
            return dataNews!!.size
        }
    }

}