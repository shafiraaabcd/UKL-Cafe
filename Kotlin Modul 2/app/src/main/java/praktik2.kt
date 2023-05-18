//Created the function
//fun jumlah(bilangan2: Array<Int>): Int{
//    var jml = 0
//    for(bil in bilangan2){
//        jml += bil
//    }
//    return jml
//}
//
//fun main(args : Array<String>){
//    val arrBil = arrayOf(10,20,30,50)
//    println("Jumlah bilangan: ${jumlah(arrBil)}")
//}

fun jumlah(vararg bil2: Int): Int{
    var jml = 0
    bil2.forEach{
        bil -> jml += bil
    }
    return jml
}

fun main(args : Array<String>){
    println("Jumlah bilangan: ${jumlah(10, 20, 30, 40, 50, 60)}")
}