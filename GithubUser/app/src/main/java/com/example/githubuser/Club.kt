package com.example.githubuser


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Club (
    var name: String,
    var description: String,
    var photo: String
    ) : Parcelable
