package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class viewmodel : ViewModel() {

val shoes=MutableLiveData<MutableList<Shoes>>()
init {
    shoes.value=ArrayList()
}
    public fun addshoe(shoename:String, shoedes:String,shoecomp:String,  shoesize:String ) {
        var shoeobj=Shoes(shoename, shoecomp, shoedes, shoesize)
        shoes.value?.add(shoeobj)
        shoes.value=shoes.value

    }

}