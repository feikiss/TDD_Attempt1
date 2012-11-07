package com.tdd.first;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
/**
 * Created with IntelliJ IDEA.
 * User: Fly
 * Date: 12-11-7
 * To change this template use File | Settings | File Templates.
 */
public class StringManagerTest {
    @Test
    public void if_input_a_a_then_A() throws Exception {
        StringManager manager = new StringManager();
        String firstInput = "a";
        String secondInput = "a";
        String expectedResult = "A";
        String actualResult = manager.manage(firstInput,secondInput);
        assertTrue(actualResult.equals(expectedResult));
    }

    @Test
    public void if_input_a_b_then_ab(){
        StringManager manager = new StringManager();
        String firstInput = "a";
        String secondInput = "b";
        String expectedResult = "ab";
        String actualResult = null;
        try {
            actualResult = manager.manage(firstInput,secondInput);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        assertTrue(actualResult.equals(expectedResult));
    }

    @Test
    public void if_input_aBC_aBC_then_Abc(){
        StringManager manager = new StringManager();
        String firstInput = "aBC";
        String secondInput = "aBC";
        String expectedResult = "Abc";
        String actualResult = null;
        try {
            actualResult = manager.manage(firstInput,secondInput);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        assertTrue(actualResult.equals(expectedResult));
    }
    @Test
    public void if_input_123_abc_then_Abc(){
        StringManager manager = new StringManager();
        String firstInput = "123";
        String secondInput = "abc";
        String expectedResult = "123abc";
        String actualResult = null;
        try {
            actualResult = manager.manage(firstInput,secondInput);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        assertTrue(actualResult.equals(expectedResult));
    }

    @Test
    public void if_input_123_123_then_throwException(){
        StringManager manager = new StringManager();
        String firstInput = "123";
        String secondInput = "123";
        String expectedResult = "wrong";
        String actualResult = null;
        try {
            manager.manage(firstInput,secondInput);
        } catch (Exception e) {
            actualResult = e.getMessage();
        }
        assertTrue(actualResult.equals(expectedResult));
    }
}
