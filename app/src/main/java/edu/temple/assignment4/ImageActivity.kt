package edu.temple.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity()
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



    }
}