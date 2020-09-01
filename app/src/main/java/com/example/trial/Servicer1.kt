package com.example.trial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.trial.databinding.FragmentServicer1Binding

class Servicer1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_servicer1, container, false)
        val binding :FragmentServicer1Binding=DataBindingUtil.inflate(inflater,R.layout.fragment_servicer1,container,false)
        return binding.root
    }


}