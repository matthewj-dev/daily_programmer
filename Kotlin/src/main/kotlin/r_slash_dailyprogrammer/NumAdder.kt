import kotlin.math.pow

// Programming challenge from here:
// https://www.reddit.com/r/dailyprogrammer/comments/aphavc/20190211_challenge_375_easy_print_a_new_number_by/?ref=share&ref_source=link

fun adder(x: Int): Int {
    val result: Int
    var num: Int = x
    val parts: MutableList<Int> = ArrayList()
    while (num > 0) {
        parts.add((num % 10) + 1)
        num /= 10
    }

    result = sumInPlace(parts)

    return result
}

fun sumInPlace(lst: MutableList<Int>): Int {
    var sum = 0
    var place = 0
    for (item in lst){

        sum += item * (place.toDouble().pow(10)).toInt()

        if (item < 10) place++
        else place += 2
    }
    return sum
}

fun main() {
    print(adder(1024))
}
