package com.example.tes_as

fun ContohList() {
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A","B","C")
    print(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    // Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

// Set adalah kumpulan data yang tidak memiliki posis atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
// Set bersifat unodered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan setOf
// Set Mutable menggunakan mutableSetOf

fun ContohSet() {
    println()
    println("=== Set ===")

    // Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)


    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    // Menghapus data ke dalam Set Mutable
    shape.add("Rectangle")
    println(shape)

    // Menambahkan data dari set Mutable
    shape.remove("Circle")
    println(shape)

    // Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

