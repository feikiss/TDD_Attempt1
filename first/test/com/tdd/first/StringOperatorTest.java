package com.tdd.first;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Fly
 * Date: 12-10-31
 * Time: 10:02
 * To change this template use File | Settings | File Templates.
 */
public class StringOperatorTest {
    @Test
    public void string_switch_a_to_A() throws Exception {
        StringOperator operator = new StringOperator();
        String param = "a";
        assertTrue(operator.switchCharacter(param).equals("A"));
    }

    @Test
    public void string_switch_A_to_a() throws Exception {
        StringOperator operator = new StringOperator();
        String param = "A";
        assertTrue(operator.switchCharacter(param).equals("a"));
    }
    @Test
    public void string_switch_asb_to_ASB() throws Exception {
        StringOperator operator = new StringOperator();
        String inputValue = "asb";
        String expectResult = "ASB";
        String actualResult = operator.switchCharacter(inputValue);
        assertTrue(expectResult.equals(actualResult));
    }

    @Test
    public void string_switch_aB_to_Ab() throws Exception {
        StringOperator operator = new StringOperator();
        String inputValue = "aB";
        String expectResult = "Ab";
        String actualResult = operator.switchCharacter(inputValue);
        assertTrue(expectResult.equals(actualResult));
    }
    @Test
    public void string_switch_123_to_exception(){
        StringOperator operator = new StringOperator();
        String inputValue = "123";
        try{
            String actualResult = operator.switchCharacter(inputValue);
        }catch (Exception e){
            assertTrue(e.getMessage().equals("wrong"));
            return;
        }
        assertEquals(true, false);
    }

}
