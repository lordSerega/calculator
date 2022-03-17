package pro.sky.calculator;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.calculator.Data.*;


public class ParamTest {


    private final CalculatorServiceImp calculator = new CalculatorServiceImp();

    @MethodSource("allData")
    @ParameterizedTest
    public void plus(int num1, int num2) {
        assertEquals(num1 + num2, calculator.plus(num1, num2));
    }

    @MethodSource("allData")
    @ParameterizedTest
    public void minus(int num1, int num2) {
        assertEquals(num1 - num2, calculator.minus(num1, num2));
    }

    @MethodSource("allData")
    @ParameterizedTest
    public void multiply(int num1, int num2) {
        assertEquals(num1 * num2, calculator.multiply(num1, num2));
    }

    @MethodSource("allData")
    @ParameterizedTest
    public void divide(int num1, int num2) {
        assertEquals(num1 / num2, calculator.divide(num1, num2));
    }


    private static Stream<Arguments> allData() {
        return Stream.of(
                Arguments.of(ZERO, FOUR),
                Arguments.of(FOUR, TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(ZERO, ONE)
        );
    }


}
