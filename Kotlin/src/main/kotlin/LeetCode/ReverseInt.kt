// do not remember where this problem was from, but it feels like LeetCode so I am putting it in this folder.

class Solution0 {
    fun reverse(x: Int): Int {
        val lst: MutableList<Char> = toList(x)
        lst.reverse()
        return toNum(lst)
    }

    fun toList(x: Int): MutableList<Char> { return x.toString().toMutableList() }

    fun toNum(lst: MutableList<Char>): Int {
        if (lst.last() != '-') {
            val temp = lst.joinToString(separator = "").toLong()
            return if (temp < Int.MAX_VALUE && temp > Int.MIN_VALUE) {
                temp.toInt()
            } else {
                0
            }
        } else {
            val neg = mutableListOf('-')
            lst.remove('-')
            neg.addAll(lst)
            val temp = neg.joinToString(separator = "").toLong()
            return if (temp < Int.MAX_VALUE && temp > Int.MIN_VALUE) {
                temp.toInt()
            } else {
                0
            }
    } }
}

//listed solution
internal class Solution1 {
    fun reverse(x: Int): Int {
        var x1 = x
        var rev = 0
        while (x1 != 0) {
            val pop = x1 % 10
            x1 /= 10
            if (rev > Int.MAX_VALUE / 10 || rev == Int.MAX_VALUE / 10 && pop > 7) return 0
            if (rev < Int.MIN_VALUE / 10 || rev == Int.MIN_VALUE / 10 && pop < -8) return 0
            rev = rev * 10 + pop
        }
        return rev
    }
}

fun main() {
    val reverse0 = Solution0()
    println(reverse0.reverse(123))
    val reverse1 = Solution1()
    println(reverse1.reverse(123))
}