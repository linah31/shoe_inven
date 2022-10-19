package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.FragmentInstuctionsBinding


class instuctions : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentInstuctionsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_instuctions, container, false)
        binding.instbtn.setOnClickListener {
            val frag = shoelist()
            val t1 = fragmentManager?.beginTransaction()
            t1?.replace(R.id.nav_container, frag)?.commit()
        }

        return binding.root
    }

}