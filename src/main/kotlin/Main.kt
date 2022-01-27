
fun main(args: Array<String>) {
    val nums = listOf<Int>( 10, 20, 100, 5)
    val isAny = nums.any()
    val isAnyOdd = nums.any{ (it % 1) > 0 }
    val isAnyBig = nums.any{ it > 1000 }


    ///“Another boolean function, all { predicate }, returns true only if every element in the list matches the predicate:”
    val isAnyAll = nums.all { it % 1 > 0 } // false”

    ///“The opposite of any is none. Without a predicate, none() returns true only if there are no elements in a collection. With a predicate, none { predicate } returns true only if the predicate evaluates to true for none of the elements in the collection. ”
    val isAny4 = nums.none { it != 4 }




    println("numbs -> $nums")
    println("isAny -> $isAny")
    println("isAnyOdd -> $isAnyOdd")
    println("isAnyBig -> $isAnyBig")
    println("isAnyAll -> $isAnyAll")
    println("isAny4 -> $isAny4")






}



