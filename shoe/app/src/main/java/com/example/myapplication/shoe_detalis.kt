package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider


class shoe_detalis : Fragment() {
    private  val viewModel: viewmodel by activityViewModels()


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_shoe_detalis, container, false)
        // Inflate the layout for this fragment
      //  viewModel = ViewModelProvider(this).get(viewmodel::class.java)
        val addbtn: Button = view.findViewById(R.id.addbtn)
        val canbtn: Button=view.findViewById(R.id.cancelbtn)
        val sname: EditText = view.findViewById(R.id.shoename)
        val sdes: EditText = view.findViewById(R.id.destxtx)
        val scomp: EditText = view.findViewById(R.id.companytxt)
        val ssize: EditText = view.findViewById(R.id.sizetxt)


        addbtn.setOnClickListener {
            var name= sname.text.toString()
            var des= sdes.text.toString()
            var comp=scomp.text.toString()
            var size=ssize.text.toString()
            viewModel.addshoe(name, des, comp, size)
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