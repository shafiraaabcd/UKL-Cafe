fun main(args: Array<String>){
    tampil()
}
class Barang(val nama: String="Kemeja", val harga: Double=80000.0, val jumlah: Double=5.0, val diskon: Double=0.50){

}
fun tampil(){
    val barang = Barang()
    println("Nama Barang = ${barang.nama}")
    println("Harga = ${barang.harga}")
    println("Jumlah = ${barang.jumlah}")
    println("Diskon = ${barang.diskon}")
    println(hitungTotal())
}
fun hitungTotal(){
    val total = Barang()
    println("Total Harga = ${total.harga * total.jumlah * total.diskon}")
}