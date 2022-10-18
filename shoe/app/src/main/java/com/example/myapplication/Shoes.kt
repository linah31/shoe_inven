package com.example.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Shoes (var name:String, var description:String, var company:String, var size:String,):
    Parcelable