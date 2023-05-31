//Leetcode problem
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hash = mutableSetOf<Int>()
        var diff: Int
        nums.forEachIndexed { index, item ->
            diff = target - item
            if (hash.contains(diff)) { return intArrayOf(nums.indexOf(diff), index) }
            hash.add(item)
        }
        return intArrayOf()
    }
}

fun main() {
    val sumCatcher = Solution()
    val arr = sumCatcher.twoSum(intArrayOf(2, 7, 11, 15), 9)
    arr.forEach { item -> println(item) }
}

