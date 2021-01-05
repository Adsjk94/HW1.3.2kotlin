import org.junit.Test
import org.junit.Assert.*
import kotlin.math.roundToInt

class MainKtTest {

    @Test
    fun calculatePayUnderLimit_Mastercard() {
        val mounthAmount = 60_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "Mastercard"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertEquals(0, result)
    }

    @Test
    fun calculatePayHigherAmountLimit_Mastercard() {
        val mounthAmount = 76_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "Mastercard"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertEquals(((amount / 100 * 0.6) + 2000).roundToInt(), result)
    }

    @Test
    fun calculatePayHigherDayLimit_Mastercard() {
        val mounthAmount = 60_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 149_000
        val vkDay = 11_000
        val cardType = "Mastercard"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertNull(result)
    }

    @Test
    fun calculatePayHigherMounthLimit_Mastercard() {
        val mounthAmount = 599_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "Mastercard"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertNull(result)
    }

    @Test
    fun calculatePayUnderLimit_Maestro() {
        val mounthAmount = 60_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "Maestro"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertEquals(0, result)
    }

    @Test
    fun calculatePayHigherMounthLimit_Maestro() {
        val mounthAmount = 599_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "Maestro"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertNull(result)
    }

    @Test
    fun calculatePayHigherDayLimit_Maestro() {
        val mounthAmount = 60_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 149_000
        val vkDay = 11_000
        val cardType = "Maestro"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertNull(result)
    }

    @Test
    fun calculatePayHigherAmountLimit_Maestro() {
        val mounthAmount = 76_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "Maestro"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertEquals(((amount / 100 * 0.6) + 2000).roundToInt(), result)
    }

    @Test
    fun calculatePayUnderLimit_Visa() {
        val mounthAmount = 60_000
        val amount = 3_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "Visa"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertEquals(3500, result)
    }

    @Test
    fun calculatePayHigherMounthLimit_Visa() {
        val mounthAmount = 599_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "Visa"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertNull(result)
    }

    @Test
    fun calculatePayHigherDayLimit_Visa() {
        val mounthAmount = 60_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 149_000
        val vkDay = 11_000
        val cardType = "Visa"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertNull(result)
    }

    @Test
    fun calculatePayHigherPayLimit_Visa() {
        val mounthAmount = 60_000
        val amount = 11_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "Visa"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertEquals((amount / 100 * 0.75).roundToInt(), result)
    }


    @Test
    fun calculatePayUnderLimit_Mir() {
        val mounthAmount = 60_000
        val amount = 3_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "МИР"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertEquals(3500, result)
    }

    @Test
    fun calculatePayHigherMounthLimit_Mir() {
        val mounthAmount = 599_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "МИР"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertNull(result)
    }

    @Test
    fun calculatePayHigherDayLimit_Mir() {
        val mounthAmount = 60_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 149_000
        val vkDay = 11_000
        val cardType = "МИР"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertNull(result)
    }

    @Test
    fun calculatePayHigherPayLimit_Mir() {
        val mounthAmount = 60_000
        val amount = 11_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "МИР"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertEquals((amount / 100 * 0.75).roundToInt(), result)
    }

    @Test
    fun calculatePayUnderLimit_VkPay() {
        val mounthAmount = 30_000
        val amount = 3_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "VkPay"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertEquals(0, result)
    }

    @Test
    fun calculatePayHigherMounthLimit_VkPay() {
        val mounthAmount = 38_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 110_000
        val vkDay = 11_000
        val cardType = "VkPay"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertNull(result)
    }

    @Test
    fun calculatePayHigherDayLimit_VkPay() {
        val mounthAmount = 450_000
        val amount = 5_000
        val maxDay = 150_000
        val maxMounth = 600_000
        val vkMaxDay = 15_000
        val vkMaxMounth = 40_000
        val day = 149_000
        val vkDay = 11_000
        val cardType = "VkPay"

        val result = pay(
            card = cardType,
            lastAmount = mounthAmount,
            thisAmount = amount,
            payMaxDay = maxDay,
            payMaxMounth = maxMounth,
            vkPayMaxDay = vkMaxDay,
            vkPayMaxMounth = vkMaxMounth,
            payDay = day,
            vkPayDay = vkDay
        )

        assertNull(result)
    }
}