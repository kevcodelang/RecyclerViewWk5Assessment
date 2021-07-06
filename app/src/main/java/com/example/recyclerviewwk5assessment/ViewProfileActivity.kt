package com.example.recyclerviewwk5assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.recyclerviewwk5assessment.databinding.ActivityMainBinding
import com.example.recyclerviewwk5assessment.models.Profile

class ViewProfileActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imgSrc = findViewById<ImageView>(R.id.imageView)
        val imgTitle = findViewById<TextView>(R.id.firstName)
        val imgDesc = findViewById<TextView>(R.id.lastName)

     }
}