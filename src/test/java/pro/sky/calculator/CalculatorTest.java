package pro.sky.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.Data.*;


public class CalculatorTest {


    private final CalculatorServiceImp calculator = new CalculatorServiceImp();

    @Test
    public void sumReturnOne() {
        assertEquals(ONE, calculator.plus(ONE, ZERO));
    }

    @Test
    public void sumReturnTwo() {
        assertEquals(TWO, calculator.plus(ONE, ONE));
    }

    @Test
    public void minusReturnTwo() {
        assertEquals(TWO, calculator.minus(THREE, ONE));
    }

    @Test
    public void minusReturnZero() {
        assertEquals(ZERO, calculator.minus(THREE, THREE));
    }

    @Test
    public void multiplyReturnOne() {
        assertEquals(ONE, calculator.multiply(ONE, ONE));
    }

    @Test
    public void multiplyReturnZero() {
        assertEquals(ZERO, calculator.multiply(ONE, ZERO));
    }

    @Test
    public void divideReturnThree() {
        assertEquals(THREE, calculator.divide(THREE, ONE));
    }

    @Test
    public void divideReturnTwo() {
        assertEquals(TWO, calculator.divide(FOUR, TWO));
    }

    @Test
    public void divideReturnException() {
        assertThrows(ZeroException.class, () -> calculator.divide(FOUR, ZERO));
    }


}
