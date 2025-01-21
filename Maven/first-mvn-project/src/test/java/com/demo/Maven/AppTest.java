package com.demo.Maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    String input1 = "noon";
    App app = new App();
    boolean expected = true;

    @Test
    public void isPlaindromeTest() {
        assertEquals(expected, app.isPalindrome(input1));
    }

    @Test
    public void isNotPlaindromeTest() {
        assertEquals(false, app.isPalindrome("abc"));
    }

    @Test
    public void isNotPlaindromeExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> app.isPalindrome(null));
    }
}
