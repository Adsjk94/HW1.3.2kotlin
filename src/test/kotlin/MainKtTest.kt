import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculatePrice_vk() {

        //arrange
        val amount = 256_000_000
        val type = "vkPay"
        val purchases = 0


        //act
        val result = calculatePrice(transferAmount = amount, cardType = type, lastPurchases = purchases)


        //assert
        assertEquals(0, result)

    }

    @Test
    fun calculatePrice_MaestroAndMaster() {

        //arrange
        val amount = 100_000_000
        val type = "Maestro"
        val purchases = 0


        //act
        val result = calculatePrice(transferAmount = amount, cardType = type, lastPurchases = purchases)


        //assert
        assertEquals(580_000, result)

    }

    @Test
    fun calculatePrice_VisaAndMir() {

        //arrange
        val amount = 100_000_000
        val type = "Visa"
        val purchases = 0


        //act
        val result = calculatePrice(transferAmount = amount, cardType = type, lastPurchases = purchases)


        //assert
        assertEquals(35_000_000, result)
        assertEquals(35_000_000, result)

    }


    @Test
    fun calculatePrice_else() {

        //arrange
        val amount = 100_000_000
        val type = "Else"
        val purchases = 0


        //act
        val result = calculatePrice(transferAmount = amount, cardType = type, lastPurchases = purchases)


        //assert
        assertEquals(600_000_001, result)

    }


    @Test
    fun calculatePrice_vk_lastPurchases() {

        //arrange
        val amount = 100_000_000
        val type = "vkPay"
        val purchases = 600_000_001


        //act
        val result = calculatePrice(transferAmount = amount, cardType = type, lastPurchases = purchases)


        //assert
        assertEquals(600_000_001, result)

    }

}