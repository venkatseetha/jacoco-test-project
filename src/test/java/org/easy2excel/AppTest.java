package org.easy2excel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void isPalindromeTest(){
        String input = "kanak";
        App app = new App();
        assertEquals(true,app.isPalindrome(input));
    }
    @Test(expected= IllegalArgumentException.class)
    public void isInputNull(){
        String input = null;
        App app = new App();
        assertEquals(false,app.isPalindrome(input));
    }
    @Test
    public void isNotAPalindromeTest(){
        String input = "daisy";
        App app = new App();
        assertEquals(false,app.isPalindrome(input));
    }
}
