fun main(args : Array<String>){
    val perkalian = {bil1: Int, bil2: Int, bil3: Int -> bil1 * bil2 * bil3}
    println("6 x 4 x 5 = ${perkalian(6,4,5)}")
}