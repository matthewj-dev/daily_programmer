package r_slash_dailyprogrammer

/*
Link: https://www.reddit.com/r/dailyprogrammer/comments/onfehl/20210719_challenge_399_easy_letter_value_sum/?utm_source=share&utm_medium=web2x&context=3
 */

/*
Challenge:
Assign every lowercase letter a value, from 1 for a to 26 for z.
Given a string of lowercase letters, find the sum of the values of the letters in the string.
 */

val letters2Number = mapOf(
    'a' to 1,
    'b' to 2,
    'c' to 3,
    'd' to 4,
    'e' to 5,
    'f' to 6,
    'g' to 7,
    'h' to 8,
    'i' to 9,
    'j' to 10,
    'k' to 11,
    'l' to 12,
    'm' to 13,
    'n' to 14,
    'o' to 15,
    'p' to 16,
    'q' to 17,
    'r' to 18,
    's' to 19,
    't' to 20,
    'u' to 21,
    'v' to 22,
    'w' to 23,
    'x' to 24,
    'y' to 25,
    'z' to 26
)

fun letterSum(string: String): UInt {
    val characters = string.toList()
    val numbers = mutableListOf<Int>()

    if (characters.isEmpty()) {
        return 0u
    }

    for (character in characters) {
        val charAsInt: Int = letters2Number[character.lowercaseChar()]!!
        numbers.add(charAsInt)
    }

    return numbers.sum().toUInt()
}

fun main() {
    println(letterSum(""))
    println(letterSum("a"))
    println(letterSum("z"))
    println(letterSum("cab"))
    println(letterSum("excellent"))
    println(letterSum("microspectrophotometries"))
}