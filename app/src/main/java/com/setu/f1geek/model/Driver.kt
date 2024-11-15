package com.setu.f1geek.model

class Driver(
    val firstName: String,
    val surName: String,
    val abbreviatedName: String,
    val number: Int,
    val age: Int,
    val headshot: Int? = null,
    val profileImage: Int? = null
) {
    val fullName: String
        get() = "$firstName $surName"
}