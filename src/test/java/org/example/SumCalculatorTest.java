package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void sum1() {
        int actual = calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sum3() {
        int actual = calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void sum6() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(0);
        });
    }
}