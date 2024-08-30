package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
    void setUp(){
        sumCalculator = new SumCalculator();
    }


    @Test
    void sumMinimalValueTest(){
        int input = 1;
        int expected = 1;

        int result = sumCalculator.sum(input);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void sumOverMinimalValueTest(){
        int input = 3;
        int expected = 6;

        int result = sumCalculator.sum(input);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void sumZeroValueTest(){
        int input = 0;

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> sumCalculator.sum(input));
    }

}