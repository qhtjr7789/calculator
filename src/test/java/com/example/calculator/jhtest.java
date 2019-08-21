package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class jhtest {
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

}
