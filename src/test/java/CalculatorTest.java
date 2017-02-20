import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void withEmptyStringReturnsZero() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void withOneNumberReturnsItsIntValue() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add("5"));
    }

    @Test
    public void withTwoNumbersReturnsTheirSum() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add("2,3"));
    }
}