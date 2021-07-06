package com.example.recyclerviewwk5assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.recyclerviewwk5assessment.adapter.ProfileAdapter
import com.example.recyclerviewwk5assessment.databinding.ActivityMainBinding
import com.example.recyclerviewwk5assessment.databinding.ActivityRecyclerBinding
import com.example.recyclerviewwk5assessment.models.Profile

class RecyclerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding
    private lateinit var myProfileAdapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val allProfile: List<Profile> = listOf(
            Profile(
                R.drawable.ic_1,
                "Kelvin",
                "kotlin",
            ),
            Profile(
                R.drawable.ic_5,
                "Liam",
                "Noah",
            ),
            Profile(
                R.drawable.ic_6,
                "Oliver",
                "Elijah",
            ),
            Profile(
                R.drawable.ic_1,
                "Emma",
                "Joseph",
            ),
            Profile(
                R.drawable.ic_5,
                "John",
                "Olivia",
            ),
            Profile(
                R.drawable.ic_6,
                "Peace",
                "Olivia",
            ),
            Profile(
                R.drawable.ic_1,
                "Eva",
                "William",
            ),
            Profile(
                R.drawable.ic_5,
                "Bright",
                "James",
            ),
            Profile(
                R.drawable.ic_6,
                "Sophia",
                "Henry",
            ),
            Profile(
                R.drawable.ic_1,
                "Mia",
                "Alexander",
            ),
            Profile(
                R.drawable.ic_5,
                "Evelyn",
                "Harper",
            ),
            Profile(
                R.drawable.ic_6,
                "Desmond",
                "Brown",
            ),
            Profile(
                R.drawable.ic_1,
                "Peace",
                "Olivia",
            ),
            Profile(
                R.drawable.ic_5,
                "Eva",
                "William",
            ),
            Profile(
                R.drawable.ic_6,
                "Bright",
                "James",
            ),
            Profile(
                R.drawable.ic_1,
                "Sophia",
                "Henry",
            ),
            Profile(
                R.drawable.ic_5,
                "Mia",
                "Alexander",
            ),
            Profile(
                R.drawable.ic_6,
                "Evelyn",
                "Harper",
            ),
            Profile(
                R.drawable.ic_1,
                "Desmond",
                "Brown",
            ),
            Profile(
                R.drawable.ic_5,
                "Desmond",
                "Brown",
            )
        )
        myProfileAdapter = ProfileAdapter(allProfile)
        binding.profileRecyclerView.adapter = myProfileAdapter



    }
}