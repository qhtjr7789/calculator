package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DowonTest {
    @Test
    public void Test_음수덧셈() {
        Calculator cal = new Calculator();
        int result = cal.add(-5, -4);
        assertEquals("add함수의 결과는 -9", -9, result);
    }
}
