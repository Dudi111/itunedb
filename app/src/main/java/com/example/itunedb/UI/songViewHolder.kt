package com.example.itunedb.UI

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.itunedb.data.Result
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_layout.view.*

class songViewHolder(private val view:View):RecyclerView.ViewHolder(view) {


    fun setdata(datalist:Result){
        view.apply {
            Picasso.get().load(datalist.artworkUrl60).into(ivimage)
            tvtrack.text=datalist.trackName
            tvartist.text=datalist.artistName
            tvcollection.text=datalist.collectionName

        }
    }
}