package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.myapplication.databinding.FragmentShoelistBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class shoelist : Fragment() {
    private  val viewModel: viewmodel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       // val view= inflater.inflate(R.layout.fragment_shoelist, container, false)
        val binding: FragmentShoelistBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoelist, container, false)

        //val abtn: FloatingActionButton =view.findViewById(R.id.addnewbtn)
        val lay=LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,10)
        setHasOptionsMenu(true)
        binding.addnewbtn.setOnClickListener {
            val frag = shoe_detalis()
            val t1 = fragmentManager?.beginTransaction()
            t1?.replace(R.id.nav_container, frag)?.commit()
        }

viewModel.shoes.observe(viewLifecycleOwner, Observer {
val iterator=it.listIterator()
    for (i in iterator){
        val _name=TextView(this.context)
        _name.text=i.name
        val _description=TextView(this.context)
        _description.text=i.description
        val _company=TextView(this.context)
        _company.text=i.company
        val _size=TextView(this.context)
        _size.text=i.size
        _name.setTextColor(Color.parseColor("#310A31"))
        _company.setTextColor(Color.parseColor("#310A31"))
        _description.setTextColor(Color.parseColor("#310A31"))
        _size.setTextColor(Color.parseColor("#310A31"))
        _name.textSize=20F
        _description.textSize=15F
        _company.textSize=20F
        _size.textSize=20F
        val mainlay=LinearLayout(this.context)
        val params: LinearLayout.LayoutParams=LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        mainlay.setBackgroundColor(Color.parseColor("#F4ECD6"))
        mainlay.setPadding(15,15,15,15)

        mainlay.addView(_name)
        mainlay.addView(_description)
        mainlay.addView(_company)
        mainlay.addView(_size)
        binding.l1.addView(mainlay,params)


    }
})


        return binding.root
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