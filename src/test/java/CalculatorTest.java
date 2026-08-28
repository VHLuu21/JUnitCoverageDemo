import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testEmptyArray() {
        int[] numbers = {};

        int result = Calculator.countEvenNumbers(numbers);

        assertEquals(0, result);
    }

    @Test
    void testAllOddNumbers() {
        int[] numbers = {1, 3, 5};

        int result = Calculator.countEvenNumbers(numbers);

        assertEquals(0, result);
    }

    @Test
    void testAllEvenNumbers() {
        int[] numbers = {2, 4, 6};

        int result = Calculator.countEvenNumbers(numbers);

        assertEquals(3, result);
    }

    @Test
    void testMixedNumbers() {
        int[] numbers = {1, 2, 3, 4};

        int result = Calculator.countEvenNumbers(numbers);

        assertEquals(2, result);
    }
}
