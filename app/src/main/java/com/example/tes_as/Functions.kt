package com.example.tes_as

fun withoutParameter() {
    println("== withoutParamater ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

// named argument
// named argument merupakan cara untuk memenaggil fungsi dengan menyebutkan nam parameter
fun withNamedArgument(name: String, age:Int){
    println()
    println("== WithNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}

// default parameter value
// default parameter value merupakan cara untuk memberikan nilaii default pada parameter fungsi
fun withDefaultParameter(name: String = "Indra",age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang :Int, lebar : Int) {
    return println(panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)
}