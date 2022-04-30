package com.coufie.mvp_news_mu1.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.coufie.mvp_news_mu1.R
import com.coufie.mvp_news_mu1.model.getAllStaffItem
import kotlinx.android.synthetic.main.item_staf.view.*

class StafAdapter(private var dataStafs : List<getAllStaffItem>) : RecyclerView.Adapter<StafAdapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val UiStaf = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_staf, parent, false)

        return  ViewHolder(UiStaf)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_stafname.text = dataStafs!![position].name
        holder.itemView.tv_stafcreatedAt.text = dataStafs!![position].createdAt
        holder.itemView.tv_stafemail.text = dataStafs!![position].email

        this.let {
            Glide.with(holder.itemView.context).load(dataStafs!![position].image).into(holder.itemView.iv_stafimage)
        }
    }

    override fun getItemCount(): Int {
       if(dataStafs == null){
           return 0
       }else{
           return dataStafs!!.size
       }
    }
}