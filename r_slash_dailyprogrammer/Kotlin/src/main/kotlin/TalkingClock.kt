// https://www.reddit.com/r/dailyprogrammer/comments/6jr76h/20170627_challenge_321_easy_talking_clock/?ref=share&ref_source=link

class TalkingClock(private val Time: String, var TimeExpanded: String = "Time not found") {
    private val tens = arrayListOf("oh ", "", "twenty ", "thirty ", "forty ", "fifty ")
    private val ones = arrayListOf("twelve ", "one ", "two ", "three ", "four ", "five ",
        "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve ",
        "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ",
        "eighteen ", "nineteen ")

    init { setTime() }

    private fun setTime() {
        var (hour, mins) = Time.split(":")
        val ampm: String

        if (hour.toInt() < 12) {
            hour = ones[hour.toInt()]
            ampm = "am"
        }
        else {
            hour = ones[hour.toInt() - 12]
            ampm = "pm"
        }

        mins = if (mins.toInt() < 10) {
            tens[0] + ones[mins.last().toString().toInt()]
        } else if (mins.toInt() < 20) {
            ones[mins.toInt()]
        } else if (mins.toInt() == 20 || mins.toInt() == 30 || mins.toInt() == 40 || mins.toInt() == 50){
            tens[mins.first().toString().toInt()]
        } else {
            tens[mins.first().toString().toInt()] + ones[mins.last().toString().toInt()]
        }

        TimeExpanded = "It's $hour$mins$ampm"
    }

    fun getTimeExpand(): String { return TimeExpanded }
}

fun main() {
    val clockBoi = TalkingClock("9:19")
    print(clockBoi.getTimeExpand())
}