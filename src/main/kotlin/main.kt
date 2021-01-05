fun main() {

    val transferAmount = 256_584_00
    var lastPurchases = 0
    val commission: Int = calculatePrice(transferAmount)
    lastPurchases += transferAmount
    println("Сумма перевода: $transferAmount, комиссия: $commission")

}

fun calculatePrice(
    transferAmount: Int,
    cardType: String = "vkPay",
    lastPurchases: Int = 0,
): Int {

    return if (checkLimits(transferAmount, lastPurchases, cardType)) {
        when (cardType) {
            "vkPay" -> 0
            "Mastercard", "Maestro" -> mastermaestro(transferAmount)
            "Visa", "Мир" -> visaworld(transferAmount)
            else -> 600_000_001
        }
    } else {
        println("Превышин лимит карты")
        600_000_001
    }
}


fun mastermaestro(transferAmount: Int): Int {
    return when (transferAmount) {
        in 0..75_000_00 -> 0
        else -> (transferAmount * 0.006 + 20_00).toInt()
    }
}

fun visaworld(transferAmount: Int): Int {
    return if (transferAmount * 0.0075 < 3500) {
        3500
    } else {
        (transferAmount * 0.0075).toInt()
    }
}

fun checkLimits(transferAmount: Int, lastPurchases: Int, cardType: String): Boolean {
    return if (cardType == "vkPay") {
        transferAmount < 15_000_000 || lastPurchases < 40_000_000
    } else {
        transferAmount < 150_000_000 || lastPurchases < 600_000_000
    }
}