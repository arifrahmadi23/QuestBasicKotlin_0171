package com.example.tes_as

// Lambda Functions
// Lambda Functions adalah fungsi yang tidak memiliki nama
// Lambda Functions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda Fungtions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercasestring (string: String): String {
    return string.uppercase()
}

// Dapat ditulis dalam ekpresi Lambda sub :
fun main() {
    uppercasestring("hello")
    println({ string:String -> string.uppercase()}("hello"))
    // HELLO
}