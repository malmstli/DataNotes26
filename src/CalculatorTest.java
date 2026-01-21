import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply() {

        Calculator calculator = new Calculator();

        int result = calculator.multiply(3, 4);

        assertEquals(12, result);
    }
}