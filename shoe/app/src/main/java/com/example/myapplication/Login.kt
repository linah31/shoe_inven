

package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.FragmentLoginBinding


class Login : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        binding.signbtn.setOnClickListener{
            val frag = welcome()
            val t1 = fragmentManager?.beginTransaction()
            t1?.replace(R.id.nav_container, frag)?.commit()
        }
        binding.logbtn.setOnClickListener {
            val frag = welcome()
            val t1 = fragmentManager?.beginTransaction()
            t1?.replace(R.id.nav_container, frag)?.commit()
        }
        return binding.root
    }





}
