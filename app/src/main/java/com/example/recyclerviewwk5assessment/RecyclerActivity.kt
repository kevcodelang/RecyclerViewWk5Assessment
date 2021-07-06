package com.example.recyclerviewwk5assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewwk5assessment.adapter.OnItemClickListener
import com.example.recyclerviewwk5assessment.adapter.ProfileAdapter
import com.example.recyclerviewwk5assessment.databinding.ActivityRecyclerBinding
import com.example.recyclerviewwk5assessment.models.Profile

class RecyclerActivity : AppCompatActivity(), OnItemClickListener {
    private lateinit var binding: ActivityRecyclerBinding
    private lateinit var myProfileAdapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val allProfile: List<Profile> = mutableListOf(
            Profile(
                R.drawable.aphoto,
                "Kelvin",
                "Badoni",
            ),
            Profile(
                R.drawable.bphoto,
                "Liam",
                "Noah",
            ),
            Profile(
                R.drawable.bvphoto,
                "Oliver",
                "Elijah",
            ),
            Profile(
                R.drawable.dephoto,
                "Emma",
                "Joseph",
            ),
            Profile(
                R.drawable.dphoto,
                "John",
                "Olivia",
            ),
            Profile(
                R.drawable.ephoto,
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
        myProfileAdapter = ProfileAdapter(allProfile,clickListener = this)
        binding.profileRecyclerView.adapter = myProfileAdapter

    }

    override fun onItemClick(profile: Profile, position: Int) {
        var intent = Intent(this, ViewProfileActivity::class.java)
        intent.putExtra("imageView", profile.profileImage.toString())
        intent.putExtra("firstName", profile.firstName)
        intent.putExtra("lastName", profile.lastName)
        startActivity(intent)

    }

}