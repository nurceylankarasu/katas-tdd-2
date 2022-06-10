package com.example.katastdd2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//Add("") // 0
//Add("4") // 4
//Add("1,2") // 3
//Add("1,2,3,4,5,6,7,8,9") // 45
//Add("1\n2,3") // 6
public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    void beforeAll() {
        stringCalculator = new StringCalculator();
    }


    @Test
    void initialization() {
        new StringCalculator().Add("0");
    }

    @Test
    void should_return_0_when_string_is_empty() {
        Assertions.assertEquals(0, stringCalculator.Add(""));
    }

    @Test
    void should_return_number_when_string_is_single() {
        Assertions.assertEquals(4, stringCalculator.Add("4"));
        Assertions.assertEquals(5, stringCalculator.Add("5"));
    }

    @Test
    void should_return_sum_of_numbers() {
        Assertions.assertEquals(3, stringCalculator.Add("1,2"));
        Assertions.assertEquals(5, stringCalculator.Add("2,3"));
        Assertions.assertEquals(45, stringCalculator.Add("1,2,3,4,5,6,7,8,9"));
    }

    @Test
    void should_return_sum_of_numbers_when_new_line_seperator() {
        Assertions.assertEquals(6, stringCalculator.Add("1\n2,3"));
        Assertions.assertEquals(7, stringCalculator.Add("2\n2,3"));
    }
}
