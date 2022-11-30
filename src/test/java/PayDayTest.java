import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PayDayTest {

    @Test
    public void testPay() {
        PayDay payDayTest = new PayDay();
        String result = payDayTest.pay("Kris", 21.0, 10.0, 0.05);
        assertEquals("Kris 21.00 10.00 0.05" ,result);
    }
}