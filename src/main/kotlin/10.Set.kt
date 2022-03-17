fun main() {
    //Set<T> menyimpan elemen unik; urutan mereka umumnya tidak terdefinisi.
    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")

    //Implementasi default Set – LinkedHashSet – mempertahankan urutan penyisipan elemen
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.first())

    val string = hashSetOf("a", "b", "c", "c") //hash menetapkan nilai unik
    println("My Ser Values are"+string)
}