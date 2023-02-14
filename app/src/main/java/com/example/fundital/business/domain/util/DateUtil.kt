package com.example.fundital.business.domain.util

import com.google.firebase.Timestamp
import java.text.DateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DateUtil
@Inject
constructor(
    private val dateFormat: DateFormat
){
//    Date format: "2023-02-12 HH:mm:ss"

    /*remove time from date stamp*/
    fun excludeTimeFromDate(ed : String) : String{
        return ed.substring(0 , ed.indexOf(" "))
    }

    fun convertFirebaseTimeStampToStringDate(timestamp : Timestamp) : String{
        return dateFormat.format(timestamp.toDate())
    }

    fun convertStringDateToFirebaseTimeStamp(sd : String) : Timestamp{
        return Timestamp(dateFormat.parse(sd))
    }

    fun getCurrentTimeStamp(): String{
        return dateFormat.format(Date())
    }


}