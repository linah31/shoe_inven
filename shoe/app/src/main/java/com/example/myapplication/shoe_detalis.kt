package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.FragmentShoeDetalisBinding


class shoe_detalis : Fragment() {
    private  val viewModel: viewmodel by activityViewModels()


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetalisBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_detalis, container, false)

        binding.addbtn.setOnClickListener {
            var name= binding.shoename.text.toString()
            var des= binding.destxtx.text.toString()
            var comp=binding.companytxt.text.toString()
            var size=binding.sizetxt.text.toString()

            viewModel.addshoe(name, des, comp, size)
            val frag = shoelist()
            val t1 = fragmentManager?.beginTransaction()
            t1?.replace(R.id.nav_container, frag)?.commit()
        }

        binding.cancelbtn.setOnClickListener{
            val frag = shoelist()
            val t1 = fragmentManager?.beginTransaction()
            t1?.replace(R.id.nav_container, frag)?.commit()
        }

        return binding.root
    }




}