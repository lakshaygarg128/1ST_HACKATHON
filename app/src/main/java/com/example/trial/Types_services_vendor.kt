package com.example.trial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

import com.example.trial.databinding.FragmentTypesServicesVendorBinding


class Types_services_vendor : Fragment() {


//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_types_services_vendor, container, false)
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentTypesServicesVendorBinding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_types_services_vendor,
                container,
                false
            )
        binding.location.setOnClickListener { view: View ->
            Navigation.findNavController(view)
                .navigate(R.id.action_types_of_services_to_mapsActivity)
        }
        return binding.root
    }
}