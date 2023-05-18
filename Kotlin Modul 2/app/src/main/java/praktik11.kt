data class Mahasiswa(val nama: String, val umur: Int)

fun main(args: Array<String>){
    val mhs = Mahasiswa("Susi Susanti", 23)

    //mengkopi umur dari objek mhs
    val mhs2 = mhs.copy(nama = "Lusiana")

    println("Nama ${mhs.nama}, Umur ${mhs.umur}")
    println("Nama ${mhs2.nama}, Umur ${mhs2.umur}")

    val nama = mhs.component1()
    val umur = mhs.component2()
    println("Nama $nama, Umur $umur")
}