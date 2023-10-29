package org.easy2excel;

public class App {

    public boolean isPalindrome(String input){
        if(input==null){
          throw new IllegalArgumentException("input can't be null");
        }
        if(input.equals(reverseAString(input))){
            return true;
        }else{
          return false;
        }
    }
    private String reverseAString(String input){
        String result = "";
        char ch ;
        for(int i = 0;i<input.length();i++){
            ch = input.charAt(i);
            result = ch+result;
        }
        return result;
    }
}
