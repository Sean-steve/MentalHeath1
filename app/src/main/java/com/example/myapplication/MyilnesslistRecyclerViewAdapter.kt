package com.example.myapplication

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.example.myapplication.placeholder.PlaceholderContent.PlaceholderItem

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyilnesslistRecyclerViewAdapter(
    private var titles: List<String>, private var details:List<String>, private var images:List<Int>) :
    RecyclerView.Adapter<MyilnesslistRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var itemTitle:TextView=itemView.findViewById(R.id.rv_title)
        var itemDetails:TextView=itemView.findViewById(R.id.rv_desc)
        var itemPicture:ImageView=itemView.findViewById(R.id.rv_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
        val v: View =
            from(parent.context).inflate(R.layout.fragment_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
        holder.itemTitle.text= titles[position].toString()
        holder.itemDetails.text=details[position]
        holder.itemPicture.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return titles.size
    }


}



