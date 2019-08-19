package com.example.calculator;

import org.junit.Test;

import java.util.concurrent.Callable;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    @Test
    public void Test_양수덧셈() {
        Calculator cal = new Calculator();
        int result = cal.add(5, 4);
//        System.out.println("result="+result);
//        if (result == 9){
//            System.out.println("성공");
//        }else {
//            System.out.println("실패");
//        }
        assertEquals(9, result);
    }

    @Test
    public void Test_음수덧셈() {
        Calculator cal = new Calculator();
        int result = cal.add(-5, -4);
        assertEquals("add함수의 결과는 -9", -9, result);
    }

    @Test
    public void Test_양수덧셈2() {
        Calculator cal = new Calculator();
        int result = cal.add(5, 4);
        assertEquals(9, result);
    }

    @Test
    public void Test_정수나눗셈1() {
        Calculator cal = new Calculator();
        int result = cal.division(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void Test_음수양수나눗셈2() {
        Calculator cal = new Calculator();
        int result = cal.division(-10, 2);
        assertEquals("나눗셈의 결과는", -5, result);
    }

    @Test
    public void Test_값이다른나눗셈3() {
        Calculator cal = new Calculator();
        int result = cal.division(10, 2);
        assertEquals(5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void Test_0으로나누는나눗셈4() {
        Calculator cal = new Calculator();
        int result = cal.division(10, 0);
        assertEquals(0, result);
    }

    @Test
    public void Test_나누는값이더큰실수나눗셈5() {
        Calculator cal = new Calculator();
        double result = cal.divisionx(10.0, 20.0);
        assertEquals(0.5, result);
    }

    @Test
    public void Test_실수나눗셈6() {
        Calculator cal = new Calculator();
        double result = cal.divisionx(-10.0, -2.0);
        assertEquals(5.0, result);
    }
    @Test
    public void Test_뺼셈계산() {
        Calculator cal = new Calculator();
        int result = cal.subtract(20, 10);

        assertEquals("두뺼셈의 차이는 1이어야함",5, result);
    }
    @Test
    public void Test_곱셈계산() {
        Calculator cal = new Calculator();
        int result = cal.multiply(5, 4);
        assertEquals("두곱셈의 값은 20이어야함",20, result);

        }
}
