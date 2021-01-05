import kotlin.math.roundToInt

fun main() {
    val payMaxDay = 150_000
    val payMaxMounth = 600_000
    val vkPayMaxDay = 15_000
    val vkPayMaxMounth = 40_000

    val payDay = 110_000
    val vkPayDay = 11_000

    val result = pay("VkPay", 30_000, 3_000, payMaxDay, payMaxMounth, vkPayMaxDay, vkPayMaxMounth, payDay, vkPayDay)
    println(if (result != null) "Коммиссия составила $result" else "Превышен лимит!")
}

fun pay(
    card: String = "VkPay",
    lastAmount: Int = 0,
    thisAmount: Int,
    payMaxDay: Int,
    payMaxMounth: Int,
    vkPayMaxDay: Int,
    vkPayMaxMounth: Int,
    payDay: Int,
    vkPayDay: Int,
): Int? {
    return if ((lastAmount + thisAmount) < payMaxMounth && (payDay + thisAmount) < payMaxDay) {
        when (card) {
            "Mastercard", "Maestro" -> if (lastAmount < 75_000) 0 else ((thisAmount / 100 * 0.6) + 2000).roundToInt()
            "Visa", "МИР" -> if ((thisAmount / 100 * 75) < 3500) 3500 else (thisAmount / 100 * 0.75).roundToInt()
            else -> if ((vkPayDay + thisAmount) < vkPayMaxDay && (lastAmount + thisAmount) < vkPayMaxMounth) 0 else null
        }
    } else null
}