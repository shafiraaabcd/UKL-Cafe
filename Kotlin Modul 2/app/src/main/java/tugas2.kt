import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    println("Menghitung Keliling dan Luas Persegi Panjang")
    println("Masukkan panjang = ")
    val panjang = input.nextInt()
    println("Masukkan lebar = ")
    val lebar = input.nextInt()
    val keliling = 2 * (panjang + lebar)
    val luas = panjang * lebar
    println("Keliling dari persegi panjang adalah = $keliling")
    println("Luas dari persegi panjang adalah = $luas")
}