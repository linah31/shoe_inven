package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.getSystemService
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton
import viewmodel


class shoe_detalis : Fragment() {
    private lateinit var viewModel: viewmodel


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_shoe_detalis, container, false)

        // Inflate the layout for this fragment
        viewModel = ViewModelProvider(this).get(viewmodel::class.java)
        val addbtn: Button = view.findViewById(R.id.addbtn)
        val canbtn: Button=view.findViewById(R.id.cancelbtn)


        val sname: EditText = view.findViewById(R.id.shoename)


        addbtn.setOnClickListener {


            val frag = shoelist()
            val t1 = fragmentManager?.beginTransaction()
            t1?.replace(R.id.nav_container, frag)?.commit()




        }

        canbtn.setOnClickListener{
            val frag = shoelist()
            val t1 = fragmentManager?.beginTransaction()
            t1?.replace(R.id.nav_container, frag)?.commit()
        }



        return view
    }




}