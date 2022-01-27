//map-function


fun main(args: Array<String>) {
    val numb = listOf<Int?>(10, null, 20, 30, 40, 50, 60, 70, 80,90, 100)
    val divideNumb = numb.mapNotNull { it?.div(2) }

    val index = numb.mapIndexed{ index: Int, value: Int? -> { println(value) } }

    println(divideNumb)
}



