package com.android.moviegallery.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.moviegallery.models.ChildModel
import com.android.moviegallery.R
import java.util.*

class ChildRecyclerViewAdapter(arrayList: ArrayList<ChildModel>, var cxt: Context) :
    RecyclerView.Adapter<ChildRecyclerViewAdapter.MyViewHolder?>() {
    private var childModelArrayList: ArrayList<ChildModel> = arrayList

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var heroImage: ImageView = itemView.findViewById(R.id.hero_image)
        var movieName: TextView = itemView.findViewById(R.id.movie_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.child_recyclerview_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem: ChildModel = childModelArrayList[position]
        holder.heroImage.setImageResource(currentItem.heroImage)
        holder.movieName.text = currentItem.movieName
    }

    override fun getItemCount(): Int {
        return childModelArrayList.size
    }
}