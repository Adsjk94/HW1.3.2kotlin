import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculatePrice_vk() {

        //arrange
        val amount: Int = 100_000_000
        val type: String = "vkPay"
        val purchases: Int = 0


        //act
        val result = calculatePrice(transferAmount = amount, cardType = type, lastPurchases = purchases)


        //assert
        assertEquals(0, result)

    }

    @Test
    fun calculatePrice_MaestroAndMaster() {

        //arrange
        val amount: Int = 100_000_000
        val type: String = "Maestro"
        val purchases: Int = 0


        //act
        val result = calculatePrice(transferAmount = amount, cardType = type, lastPurchases = purchases)


        //assert
        assertEquals(580_000, result)

    }

    @Test
    fun calculatePrice_VisaAndMir() {

        //arrange
        val amount: Int = 100_000_000
        val type: String = "Visa"
        val purchases: Int = 0


        //act
        val result = calculatePrice(transferAmount = amount, cardType = type, lastPurchases = purchases)


        //assert
        assertEquals(35_000_000, result)

    }


    @Test
    fun calculatePrice_else() {

        //arrange
        val amount: Int = 100_000_000
        val type: String = "Else"
        val purchases: Int = 0


        //act
        val result = calculatePrice(transferAmount = amount, cardType = type, lastPurchases = purchases)


        //assert
        assertEquals(600_000_001, result)

    }


    @Test
    fun calculatePrice_vk_lastPurchases() {

        //arrange
        val amount: Int = 100_000_000
        val type: String = "vkPay"
        val purchases: Int = 600_000_001


        //act
        val result = calculatePrice(transferAmount = amount, cardType = type, lastPurchases = purchases)


        //assert
        assertEquals(600_000_001, result)

    }

}