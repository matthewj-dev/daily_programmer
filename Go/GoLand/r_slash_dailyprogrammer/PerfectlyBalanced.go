package main

import (
	"strings"
)

// https://www.reddit.com/r/dailyprogrammer/comments/afxxca/20190114_challenge_372_easy_perfectly_balanced/

/*
Given a string containing only the characters x and y, find whether there are the same number of xs and ys.
*/

func balanced(xsAndYsString string) bool {

	characters := strings.Split(xsAndYsString, "")

	numberOfX := 0
	numberOfY := 0

	for i := range characters {
		char := strings.ToLower(characters[i])

		if char == "x" {
			numberOfX++
		} else if char == "y" {
			numberOfY++
		}
	}

	return numberOfX == numberOfY
}

func main() {
	println(balanced("xxxyyy"))
	println(balanced("yyyxxx"))
	println(balanced("xxxyyyy"))
	println(balanced("yyxyxxyxxyyyyxxxyxyx"))
	println(balanced("xyxxxxyyyxyxxyxxyy"))
	println(balanced(""))
	println(balanced("x"))
}
