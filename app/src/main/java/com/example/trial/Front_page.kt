package com.example.trial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.trial.databinding.FragmentFrontPageBinding

class Front_page : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentFrontPageBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_front_page,container,false)
        binding.button2.setOnClickListener {view :View ->
      Navigation.findNavController(view).navigate(R.id.action_front_page_to_types_of_services)
        }
        binding.fb.setOnClickListener { view:View ->
        Navigation.findNavController(view).navigate(R.id.action_front_page_to_customer_info)}
        return binding.root
    }

    }