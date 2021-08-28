package com.lhm777.regexvalidator;

import java.util.regex.Pattern;


public class RegexValidatorMain {
    
    
    public static void main(String args[]){
    
        RegexValidator regexValidator = new RegexValidator();
        
        System.out.println(regexValidator.onlyLetters("abcd"));
    }
}
