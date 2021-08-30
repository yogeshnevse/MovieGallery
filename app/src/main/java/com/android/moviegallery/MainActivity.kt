package com.android.moviegallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.moviegallery.adapters.ParentRecyclerViewAdapter
import com.android.moviegallery.models.ParentModel
import java.util.*


class MainActivity : AppCompatActivity() {
    private var parentRecyclerView: RecyclerView? = null
    private var parentAdapter: RecyclerView.Adapter<*>? = null
    var parentModelArrayList: ArrayList<ParentModel> = ArrayList<ParentModel>()
    private var parentLayoutManager: RecyclerView.LayoutManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set the Categories for each array list set in the `ParentViewHolder`
        parentModelArrayList.add(ParentModel("Category1"))
        parentModelArrayList.add(ParentModel("Category2"))
        parentModelArrayList.add(ParentModel("Category3"))
        parentModelArrayList.add(ParentModel("Category4"))
        parentModelArrayList.add(ParentModel("Category5"))
        parentModelArrayList.add(ParentModel("Category6"))
        parentRecyclerView = findViewById(R.id.Parent_recyclerView)
        parentRecyclerView?.setHasFixedSize(true)
        parentLayoutManager = LinearLayoutManager(this)
        parentAdapter = ParentRecyclerViewAdapter(parentModelArrayList, this@MainActivity)
        parentRecyclerView?.layoutManager = parentLayoutManager
        parentRecyclerView?.adapter = parentAdapter
        parentAdapter!!.notifyDataSetChanged()
    }
}
