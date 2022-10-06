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

            //adding variable names to place name and image
            //identifying recycler view
            val recyclerView = findViewById<RecyclerView>(R.id.recycleView)

                //using grid layout manager and adding 5 images per row
                recyclerView.layoutManager = GridLayoutManager(this, 5)

                placeName = findViewById(R.id._placeName)
                placeImage = findViewById(R.id._placeImage)

                    //images list using drawable and listof
                    val imageList = listOf<Int>(
                        R.drawable.chicago, R.drawable.nyc, R.drawable.paris, R.drawable.dubai,
                        R.drawable.korea, R.drawable.istanbul, R.drawable.toronto, R.drawable.egypt, R.drawable.california, R.drawable.antalya)

                    //creating list of string names that represent the images
                    val placeName = listOf<String>("Chicago","New York","Paris", "Dubai", "Korea", "Istanbul","Toronto","Egypt","California","Antalya")

                //custom adapter called image adapter
                recyclerView.adapter = ImageAdapter(this, imageList, placeName, this)
    }
    //function for text to show name of image
    override fun onImageClicked(name: String, image: Int)
    {
        //image is clicked in recycler view, selected image and text
        placeName.text = name;
        placeImage.setImageResource(image)
    }
}