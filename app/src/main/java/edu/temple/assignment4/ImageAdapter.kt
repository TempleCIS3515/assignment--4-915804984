package edu.temple.assignment4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(
    private val context: Context,
                   private val imageList: List<Int>,
                   private val placeName: List<String>,
                   private val listener: ImageOperations
                   ): RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.place_list_item, parent, false)
        return ViewHolder(view)
    }

}