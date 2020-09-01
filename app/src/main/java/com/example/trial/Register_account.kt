package com.example.trial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.trial.databinding.FragmentRegisterAccountBinding

class Register_account : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_register_account, container, false)
        val binding:FragmentRegisterAccountBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_register_account,container,false)
        return binding.root
    }


}