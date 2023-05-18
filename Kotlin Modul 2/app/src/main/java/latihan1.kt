fun main(args : Array<String>){
    val pangkat = {bil1: Double, bil2: Double -> Math.pow(bil1, bil2)}
    println("6 pangkat 3 = ${pangkat(6.0, 3.0)}")
}