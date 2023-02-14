package com.example.fundital.business.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Course (
    val id : String,
    val title : String,
    val description : String,
    val prerequisites : String,
    val ownerId : String,
    val institution : String,
    val date_created: String

):Parcelable