package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                supportFragmentManager.beginTransaction().replace(R.id.nav_container,Login()).commit()

    }

}

//   val binding: FragmentLoginBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
//binding.signbtn.setOnClickListener { v: View ->
//  v.findNavController().navigate(LoginDirections.actionLoginToWelcome())

//}
//return binding.root
//val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//val navController = this.findNavController(R.id.myNavHostFragment)