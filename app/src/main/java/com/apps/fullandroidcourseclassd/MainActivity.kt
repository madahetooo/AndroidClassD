package com.apps.fullandroidcourseclassd

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.apps.fullandroidcourseclassd.databinding.ActivityMainBinding

class MainActivity : Fragment() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityMainBinding.inflate(inflater,container,false)
        val view = binding.root
        var count = 0
        binding.btnCount.setOnClickListener {
            count++
            binding.tvCounter.text = "Lets Count Together $count"
        }
    return view
    }
}