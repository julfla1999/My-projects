package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 20;
        int b = 14;
        int subtractResult = calculator.subtract(a,b);
        assertEquals(6, subtractResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = -4;
        int squareResult = calculator.square(a);
        assertEquals(16, squareResult);
        a = 0;
        squareResult = calculator.square(a);
        assertEquals(0, squareResult);
        a = 4;
        squareResult = calculator.square(a);
        assertEquals(16, squareResult);

    }
}
