package com.android.moviegallery.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.moviegallery.models.ChildModel
import com.android.moviegallery.models.ParentModel
import com.android.moviegallery.R
import java.util.*

class ParentRecyclerViewAdapter(exampleList: ArrayList<ParentModel>, context: Context) :
    RecyclerView.Adapter<ParentRecyclerViewAdapter.MyViewHolder?>() {
    private val parentModelArrayList: ArrayList<ParentModel> = exampleList
    var cxt: Context = context

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var category: TextView = itemView.findViewById(R.id.Movie_category)
        var childRecyclerView: RecyclerView = itemView.findViewById(R.id.Child_RV)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.parent_recyclerview_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem: ParentModel = parentModelArrayList[position]
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(cxt, LinearLayoutManager.HORIZONTAL, false)
        holder.childRecyclerView.layoutManager = layoutManager
        holder.childRecyclerView.setHasFixedSize(true)
        holder.category.text = currentItem.movieCategory()
        val arrayList: ArrayList<ChildModel> = ArrayList<ChildModel>()

        // added the first child row
        if (parentModelArrayList[position].movieCategory().equals("Category1")) {
            arrayList.add(ChildModel(R.drawable.themartian, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moana, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.mov2, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.blackp, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi2, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood1, "Movie Name"))
        }

        // added in second child row
        if (parentModelArrayList[position].movieCategory().equals("Category2")) {
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi2, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi3, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi1, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi4, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi5, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi6, "Movie Name"))
        }

        // added in third child row
        if (parentModelArrayList[position].movieCategory().equals("Category3")) {
            arrayList.add(ChildModel(R.drawable.hollywood6, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood5, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood4, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood3, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood2, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood1, "Movie Name"))
        }

        // added in fourth child row
        if (parentModelArrayList[position].movieCategory().equals("Category4")) {
            arrayList.add(ChildModel(R.drawable.bestofoscar6, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar5, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar4, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar3, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar2, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar1, "Movie Name"))
        }

        // added in fifth child row
        if (parentModelArrayList[position].movieCategory().equals("Category5")) {
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi4, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood2, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar4, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.mov2, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood1, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar1, "Movie Name"))
        }

        // added in sixth child row
        if (parentModelArrayList[position].movieCategory().equals("Category6")) {
            arrayList.add(ChildModel(R.drawable.hollywood5, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.blackp, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar4, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.moviedubbedinhindi6, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.hollywood1, "Movie Name"))
            arrayList.add(ChildModel(R.drawable.bestofoscar6, "Movie Name"))
        }
        val childRecyclerViewAdapter =
            ChildRecyclerViewAdapter(arrayList, holder.childRecyclerView.context)
        holder.childRecyclerView.adapter = childRecyclerViewAdapter
    }

    override fun getItemCount(): Int {
        return parentModelArrayList.size
    }
}