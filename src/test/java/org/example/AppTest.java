package org.example;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest {
    @Test
    public void testAdditionPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in addition()",  3, App.Calculator.addition(1, 2));
        assertEquals("error in addition()", -3, App.Calculator.addition(-1, -2));
        assertEquals("error in addition()",  9, App.Calculator.addition(9, 0));

    }

    @Test
    public void testAdditionFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals("error in add()", 0, App.Calculator.addition(1, 2));
    }
    @Test
    public void testSubtractionPass() {
        assertEquals("error in sub()",  1, App.Calculator.subtraction(2, 1));
        assertEquals("error in sub()", -1, App.Calculator.subtraction(-2, -1));
        assertEquals("error in sub()",  0, App.Calculator.subtraction(2, 2));
    }
    @Test
    public void testSubtractionFail() {
        assertNotEquals("error in sub()", 0, App.Calculator.subtraction(2, 1));
    }

}


