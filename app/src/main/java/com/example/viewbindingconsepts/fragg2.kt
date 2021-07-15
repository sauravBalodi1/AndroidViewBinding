package com.example.viewbindingconsepts

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbindingconsepts.databinding.FragmentFirstBinding
import com.example.viewbindingconsepts.databinding.FragmentFragg2Binding

// TODO: Rename parameter arguments, choose names that match

class fragg2 : Fragment() {


    private lateinit var binding:FragmentFragg2Binding //the name of the second xml file
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFragg2Binding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.text2.setText("From second fragment")
    }


}