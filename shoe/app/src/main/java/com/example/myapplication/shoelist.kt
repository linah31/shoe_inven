package com.example.myapplication

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.floatingactionbutton.FloatingActionButton
import viewmodel


class shoelist : Fragment() {
    //private lateinit var viewModel: viewmodel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_shoelist, container, false)
        val abtn: FloatingActionButton =view.findViewById(R.id.addnewbtn)

        setHasOptionsMenu(true)


        abtn.setOnClickListener {
            val frag = shoe_detalis()
            val t1 = fragmentManager?.beginTransaction()
            t1?.replace(R.id.nav_container, frag)?.commit()


        }



        return view
    }



    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logoutmenu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.logoutitem -> {
                val frag = Login()
                val t1 = fragmentManager?.beginTransaction()
                t1?.replace(R.id.nav_container, frag)?.commit()

            }
        }
        return super.onOptionsItemSelected(item)
    }
}