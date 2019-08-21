package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DowonTest {
    @Test
    public void Test_정수나눗셈1() {
        Calculator cal = new Calculator();
        int result = cal.division(10, 2);
        assertEquals(5, result);
    }
}
