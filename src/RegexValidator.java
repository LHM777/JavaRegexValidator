package com.lhm777.regexvalidator;

import java.util.regex.Pattern;


public class RegexValidator{
	
	
	public boolean onlyLetters(String x){
    
        return Pattern.matches("[a-zA-Z]+", x);
    }
	
}