package com.tdd.first;

//try push
//try push 2
public class StringOperator {
    public String switchCharacter(String param) throws Exception {
        String result = "";
        for(int index = 0; index < param.length(); index ++){
            char tempChar = param.charAt(index);
            int intValue = (int)tempChar;
            if(intValue>=65&&intValue<=90){
                tempChar = (char)(intValue+32);
            } else if(intValue>=97&&intValue<=122){
                tempChar = (char)(intValue-32);
            }else{
                throw new Exception("wrong");
            }
            result+=tempChar;
        }
        return result;
    }
}
