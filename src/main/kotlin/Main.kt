
fun main(args: Array<String>) {
    val numbs = listOf(10, 20, 100, 5)

    ///“The basic filter function will return a new collection containing only the elements of the original collection that match the given predicate.”
    val numIsGreaterThan20 = numbs.filter { it > 10 }

    /// the filterNot is the reverse
    val numIsNotGreaterThan20 = numbs.filterNot { it > 10 }

    ///removing all null in a list
    val mixedValues = listOf<Int?>(10, null, 12, 104, 234 )
    val allInt = mixedValues.filterNotNull();


    println("numIsGreaterThan20 > $numIsGreaterThan20") //[20, 100]
    println("numIsNotGreaterThan20 > $numIsNotGreaterThan20") //[10, 50]

    println("allInt $allInt")

}



