package edu.temple.assignment4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

//custom adapter inherits from RecyclerView.Adapter
class ImageAdapter(private val context: Context, private val imageList: List<Int>, private val placeName: List<String>, private val listener: ImageOperations): RecyclerView.Adapter<ImageAdapter.ViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.place_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        holder.imageView.setImageResource(imageList[position])
        holder.imageView.setOnClickListener(View.OnClickListener { listener.onImageClicked(placeName[position], imageList[position])
        })
    }

    override fun getItemCount(): Int
    {
        return imageList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.img_place)
    }

    interface ImageOperations {
        fun onImageClicked(name: String, img: Int)
    }
}
