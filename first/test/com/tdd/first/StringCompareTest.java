package com.tdd.first;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Fly
 * Date: 12-10-31
 * To change this template use File | Settings | File Templates.
 */
public class StringCompareTest {

    @Test
    public void input_a_and_a_will_return_true(){
        StringCompare stringCompare = new StringCompare();
        String firstInput = "a";
        String secondInput = "a";
        assertTrue(stringCompare.compare(firstInput, secondInput));
    }
    @Test
    public void input_a_and_b_will_return_false(){
        StringCompare stringCompare = new StringCompare();
        String firstInput = "a";
        String secondInput = "b";
        assertFalse(stringCompare.compare(firstInput, secondInput));
    }

    @Test
    public void input_abc_and_abc_will_return_true(){
        StringCompare stringCompare = new StringCompare();
        String firstInput = "abc";
        String secondInput = "abc";
        assertTrue(stringCompare.compare(firstInput, secondInput));
    }

    @Test
    public void input_abcObject_and_abcObject_will_return_true(){
        StringCompare stringCompare = new StringCompare();
        String firstInput = new String("abc");
        String secondInput = new String("abc");
        assertTrue(stringCompare.compare(firstInput, secondInput));
    }

    @Test
    public void input_abcObject_and_abc_will_return_true(){
        StringCompare stringCompare = new StringCompare();
        String firstInput = new String("abc");
        String secondInput = "abc";
        assertTrue(stringCompare.compare(firstInput, secondInput));
    }

}
