package com.tdd.first;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
/**
 * Created with IntelliJ IDEA.
 * User: Fly
 * Date: 12-10-31
 * Time: 10:19
 * To change this template use File | Settings | File Templates.
 */
public class RandomTest {
    @Test
    public void testSwitchCharToASC(){
        char tempChar = 'a';
        int switchedValue = (int) tempChar;
        assertTrue(switchedValue == 97);
    }

    @Test
    public void testSwitchASCToChar(){
        int tempInt = 97;
        char switchedValue = (char) tempInt;
        assertTrue(switchedValue == 'a');
    }
    @Test
    public void testSwitchNumCharToASC(){
        char tempChar = '5';
        int switchedValue = (int) tempChar;
        assertTrue(switchedValue == 53);
    }

}
