import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigDecimal

//fun japaneseSalary(base : BigDecimal, years : Int): BigDecimal = TODO("later")

class japSel {
    @Test
    fun japSel(){
        Assertions.assertEquals(150_000.toBigDecimal(), japaneseSalary(100_000.toBigDecimal(), 5))
    }

}