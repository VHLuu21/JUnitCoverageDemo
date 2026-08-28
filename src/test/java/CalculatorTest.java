import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testMixedNumbers() {
        int[] numbers = {1, 2, 3, 4};

        int result = Calculator.countEvenNumbers(numbers);

        assertEquals(2, result);
    }

    @Test
    void testNoEvenNumbers() {
        int[] numbers = {1, 3, 5};

        int result = Calculator.countEvenNumbers(numbers);

        assertEquals(0, result);
    }
}
