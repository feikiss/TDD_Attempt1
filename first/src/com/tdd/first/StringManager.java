package com.tdd.first;

/**
 * Created with IntelliJ IDEA.
 * User: Fly
 * Date: 12-11-7
 * To change this template use File | Settings | File Templates.
 */
public class StringManager {
    public String manage(String firstInput, String secondInput) throws Exception {
        StringCompare strCompare = new StringCompare();
        StringOperator stringOperator = new StringOperator();
        if(strCompare.compare(firstInput,secondInput)){
            return stringOperator.switchCharacter(firstInput);
        }else {
            return firstInput+secondInput;
        }


    }
}
