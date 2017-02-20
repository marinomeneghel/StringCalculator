import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void withEmptyStringReturnsZero() throws Exception {
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void withOneNumberReturnsItsIntValue() throws Exception {
        assertEquals(5, calculator.add("5"));
    }

    @Test
    public void withTwoNumbersReturnsTheirSum() throws Exception {
        assertEquals(5, calculator.add("2,3"));
    }

    @Test
    public void withAnyNumbersAmountReturnTheirSum() throws Exception {
        assertEquals(10, calculator.add("3,2,4,1"));
    }
}