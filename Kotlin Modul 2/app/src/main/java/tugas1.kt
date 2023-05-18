fun penjumlahan(){
    val penjumlahan = {bil1: Int, bil2: Int -> bil1 + bil2 }
    println("10 + 5 = ${jumlah(10,5)}")
}

fun perkalian(){
    val perkalian = {bil1: Int, bil2: Int -> bil1 * bil2 }
    println("10 x 5 = ${perkalian(10,5)}")
}

fun pembagian(){
    val pembagian = {bil1: Int, bil2: Int -> bil1 / bil2 }
    println("10 / 5 = ${pembagian(10,5)}")
}

fun pengurangan(){
    val pengurangan = {bil1: Int, bil2: Int -> bil1 - bil2 }
    println("10 - 5 = ${pengurangan(10,5)}")
}

fun main(){
    penjumlahan()
    perkalian()
    pembagian()
    pengurangan()
}