import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class TestGreet {

    @Test
    fun japSel(){
        assertEquals(150_000.toBigDecimal(),japaneseSalary(100_000.toBigDecimal(),5))
    }

}