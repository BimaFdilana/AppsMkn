package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class Superhero(
    var descSuperhero: String? = null,
    var nameSuperhero: String? = null,
    var imgSuperhero: Int=0
) : Parcelable


