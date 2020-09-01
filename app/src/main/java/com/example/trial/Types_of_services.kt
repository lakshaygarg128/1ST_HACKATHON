package com.example.trial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.trial.databinding.FragmentTypesOfServicesBinding
import java.util.zip.Inflater

class Types_of_services : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        
        val binding : FragmentTypesOfServicesBinding =DataBindingUtil.inflate(inflater,R.layout.fragment_types_of_services,container,false)
        return binding.root
       // return inflater.inflate(R.layout.fragment_types_of_services, container, false)
    }


}