fun main(args: Array<String>){
    val sum = func(10)
    println("10 + 20: ${sum(20)}")
}

fun func(num: Int): (Int) -> Int = {num2 -> num2 + num}