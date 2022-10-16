package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import viewmodel


class Login : Fragment() {

    private lateinit var viewModel: viewmodel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_login, container, false)

        val lbtn: Button=view.findViewById(R.id.logbtn)
        val sbtn: Button=view.findViewById(R.id.signbtn)
        lbtn.setOnClickListener {
            val frag = welcome()
            val t1 = fragmentManager?.beginTransaction()
            t1?.replace(R.id.nav_container, frag)?.commit()
        }
        sbtn.setOnClickListener {
            val frag = welcome()
            val t1 = fragmentManager?.beginTransaction()
            t1?.replace(R.id.nav_container, frag)?.commit()
        }
        return view
    }

    private fun createviewmodel (){
        viewModel= ViewModelProvider(this).get(viewmodel:: class.java)
    }



}