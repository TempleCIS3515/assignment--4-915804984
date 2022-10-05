package edu.temple.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity(), ImageAdapter.ImageOperations
{
    //variables with the assigned view type
    lateinit var placeName: TextView
    lateinit var placeImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycleView)
        placeName = findViewById(R.id._placeName)
        placeImage = findViewById(R.id._placeImage)

        //grid layout manager
        recyclerView.layoutManager = GridLayoutManager(this, 4)

        //images and names
        val imageList = listOf<Int>(
            R.drawable.chicago, R.drawable.nyc, R.drawable.paris, R.drawable.dubai,
            R.drawable.korea, R.drawable.istanbul, R.drawable.Toronto, R.drawable.egypt, R.drawable.california, R.drawable.Antalya)
        val placeName = listOf<String>("Chicago","New York","Paris", "Dubai", "Korea", "Istanbul","Toronto","Egypt","California","Antalya")

        //custom adapter called image adapter
        recyclerView.adapter = ImageAdapter(this, imageList, placeName, this)
    }

    override fun onImageClicked(name: String, img: Int)
    {
        //image is clicked in recycler view, selected image and text
        placeName.text = name;
        placeImage.setImageResource(img)
    }
}