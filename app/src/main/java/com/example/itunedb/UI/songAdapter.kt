package com.example.itunedb.UI

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.itunedb.R
import com.example.itunedb.data.ResponseModel
import com.example.itunedb.data.Result

class songAdapter(val songlist:ArrayList<ResponseModel>) :RecyclerView.Adapter<songViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): songViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return songViewHolder(view)
    }

    override fun onBindViewHolder(holder: songViewHolder, position: Int) {
        val model=songlist[position].results[position]
        holder.setdata(model)
    }

    override fun getItemCount(): Int {
return songlist.size   }
}