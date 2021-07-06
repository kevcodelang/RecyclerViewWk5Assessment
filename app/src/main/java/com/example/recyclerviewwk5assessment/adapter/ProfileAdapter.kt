package com.example.recyclerviewwk5assessment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwk5assessment.databinding.ProfileItemBinding
import com.example.recyclerviewwk5assessment.models.Profile

class ProfileAdapter(val allProfile: List<Profile>) :
    RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {
    class ProfileViewHolder(var binding: ProfileItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(profile: Profile) {
            binding.profileImages.setImageResource(profile.profileImage)
            binding.firstName.text = profile.firstName
            binding.lastName.text = profile.lastName

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        var binding = ProfileItemBinding.inflate(LayoutInflater.from(parent.context))
        return ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val profile = allProfile[position]
        holder.bind(profile)
    }

    override fun getItemCount(): Int {
        return allProfile.size
    }

}