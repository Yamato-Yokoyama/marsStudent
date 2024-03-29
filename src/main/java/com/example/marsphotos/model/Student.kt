package com.example.marsphotos.model
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class Student(
    val fname:String,
    val lname:String,
    val country:String,
)