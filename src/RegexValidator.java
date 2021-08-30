package com.lhm777.regexvalidator;

import java.util.regex.Pattern;


public class RegexValidator{
	
	
	public boolean onlyLetters(String x){
    
        return Pattern.matches("[a-zA-Z]+", x);
    }
	
	
	
	public boolean OneOrMoreNumbers(String x){
    
        return Pattern.matches("\\d+", x);
    }
	
	
	
	public boolean DecimalNumber(String x){
    
        return Pattern.matches("\\d+(\\.\\d+)?", x);
    }
	
	
	
    public boolean thousandsSeparator(String x){
    
        return Pattern.matches("(\\d{1,3})(\\,\\d{3})*", x);
    }
	
	
	
	public boolean decimalsAndThousandsSeparators(String x){
    
        return Pattern.matches("(\\d{1,3})(\\,\\d{3})*(\\.\\d+)?", x);
    }
	
	
	
	/*Regex for negative numbers including decimal numbers*/
	public boolean negativeNumbers(String x){
    
        return Pattern.matches("\\-[1-9]+(\\.\\d+)*", x);
    }
	
}