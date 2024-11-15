package com.setu.f1geek.model

class Driver(
    val firstName: String,
    val surName: String,
    val abbreviatedName: String,
    val number: Int,
    val age: Int,
) {
    val fullName: String
        get() = "$firstName $surName"
}