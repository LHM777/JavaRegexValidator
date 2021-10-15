# JavaRegexValidator
This Java Class can be used for validating input strings using REGEX. Below, I will show how you can use this class for validating various string inputs.



# Check if input string contains only letters
The code below shows a simple way to check if the input field only contains letters. If the value of the input field is not valid, then store an error message:


```java

RegexValidator regexValidator = new RegexValidator();
String input = "abcd";

if(!regexValidator.onlyLetters(input)){

    String inputErr = "Only letters are allowed";
}

```

We used the RegexValidator class' onlyLetters() method to validate the input field. The code below shows the onlyLetters() method of the RegexValidator class:

```java

    public boolean onlyLetters(String x){
    
        return Pattern.matches("[a-zA-Z]+", x);
    }
    
```

The Pattern.matches() function searches a string for pattern, returning true if the pattern exists, and false otherwise.




# Check if input string contains only letters. It must occur only 6 times.
The code below shows a simple way to check if the input field only contains letters and whether it exceeds 6 characters in length. If the input is more than 6 characters long, then it will not be valid.
```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it's only 4 characters long.
String input = "abcd";

if(!regexValidator.onlyLettersSixCharacters(input)){

    String inputErr = "Only letters are allowed, and it should not exceed six characters long.";
}



//This input will be valid because it's 6 characters long.
String input = "abcdef";

if(!regexValidator.onlyLettersSixCharacters(input)){

    String inputErr = "Only letters are allowed, and it should not exceed six characters long.";
}


//This input will not be valid because it's 7 characters long.
String input = "abcdefg";

if(!regexValidator.onlyLettersSixCharacters(input)){

    String inputErr = "Only letters are allowed, and it should not exceed six characters long.";
}

```


We used the RegexValidator class' onlyLettersSixCharacters() method to validate the input field. The code below shows the onlyLettersSixCharacters() method of the RegexValidator class:

```java

    public boolean onlyLettersSixCharacters(String x){
    
        return Pattern.matches("[a-zA-Z]{6}", x);
    }
    
```




# Check if input string contains only letters. It should be at least 1 character in length but no more than 6 characters long.
The code below shows a way to check if the input field only contains letters and whether it is at least 1 character long and no more than 6 characters long otherwise it will be invalid.


```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it's at least 1 character long.
String input = "a";

if(!regexValidator.onlyLettersPart3(input)){

    String inputErr = "Only letters are allowed, and it should be at least 1 character long but no more than 6 characters long.";
}



//This input will be valid because it's at least 4 characters long.
String input = "abcd";

if(!regexValidator.onlyLettersPart3(input)){

    String inputErr = "Only letters are allowed, and it should be at least 1 character long but no more than 6 characters long.";
}



//This input will be valid because it's 6 characters long.
String input = "abcdef";

if(!regexValidator.onlyLettersPart3(input)){

    String inputErr = "Only letters are allowed, and it should be at least 1 character long but no more than 6 characters long.";
}



//This input will not be valid because it's more than 6 characters long.
String input = "abcdefg";

if(!regexValidator.onlyLettersPart3(input)){

    String inputErr = "Only letters are allowed, and it should be at least 1 character long but no more than 6 characters long.";
}

```



We used the RegexValidator class' onlyLettersPart3() method to validate the input field. The code below shows the onlyLettersPart3() method of the RegexValidator class:

```java

    public boolean onlyLettersPart3(String x){
    
        return Pattern.matches("[a-zA-Z]{1,6}", x);
    }
    
```




# Check if input string contains only numbers.
The code below shows a simple way to check if the input field only contains numbers. If the value of the input field is not valid, then store an error message:


```java

RegexValidator regexValidator = new RegexValidator();
String input = "123456";

if(!regexValidator.OneOrMoreNumbers(input)){

    String inputErr = "Only numbers are allowed";
}

```



We used the RegexValidator class' OneOrMoreNumbers() method to validate the input field. The code below shows the OneOrMoreNumbers() method of the RegexValidator class:

```java

    public boolean OneOrMoreNumbers(String x){
    
        return Pattern.matches("\\d+", x);
    }
    
```




# Check if input string contains only numbers. It should be only one character long.



```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it's only 1 character long.
String input = "1";

if(!regexValidator.onlyOneNumber(input)){

    String inputErr = "Only numbers are allowed, and it should only be 1 character long.";
}



//This input will not be valid because it's 2 characters long.
String input = "12";

if(!regexValidator.onlyOneNumber(input)){

    String inputErr = "Only numbers are allowed, and it should only be 1 character long.";
}



//This input will not be valid because it includes letters.
String input = "abcdef11";

if(!regexValidator.onlyOneNumber(input)){

    String inputErr = "Only numbers are allowed, and it should only be 1 character long.";
}

```


We used the RegexValidator class' onlyOneNumber() method to validate the input field. The code below shows the onlyOneNumber() method of the RegexValidator class:

```java

    public boolean onlyOneNumber(String x){
    
        return Pattern.matches("\\d", x);
    }
    
```




# Check if input string contains only numbers. It should be at least 1 character in length but no more than 6 characters long.


```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it's at least 1 character long.
String input = "1";

if(!regexValidator.onlyNumbersPart3(input)){

    String inputErr = "Only numbers are allowed, and it should be at least 1 character long but no more than 6 characters long.";
}



//This input will be valid because it's 4 characters long.
String input = "1234";

if(!regexValidator.onlyLettersPart3(input)){

    String inputErr = "Only numbers are allowed, and it should be at least 1 character long but no more than 6 characters long.";
}



//This input will be valid because it's 6 characters long.
String input = "123456";

if(!regexValidator.onlyLettersPart3(input)){

   String inputErr = "Only numbers are allowed, and it should be at least 1 character long but no more than 6 characters long.";
}



//This input will not be valid because it's more than 6 characters long.
String input = "1234567";

if(!regexValidator.onlyLettersPart3(input)){

    String inputErr = "Only numbers are allowed, and it should be at least 1 character long but no more than 6 characters long.";
}


//This input will not be valid because it contains letters.
String input = "123abc";

if(!regexValidator.onlyLettersPart3(input)){

    String inputErr = "Only numbers are allowed, and it should be at least 1 character long but no more than 6 characters long.";
}

```



We used the RegexValidator class' onlyNumbersPart3() method to validate the input field. The code below shows the onlyNumbersPart3() method of the RegexValidator class:

```java

    public boolean onlyNumbersPart3(String x){
    
        return Pattern.matches("\\d{1,6}", x);
    }
    
```




# Check if input string contains alphanumeric characters. It should only be up to six characters long.
The code below shows a simple way to check if the input field contains alphanumeric characters. If the value of the input field is not valid, then store an error message:



```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it contains alphanumeric characters and it's length is only up to six characters long.
String input = "123abc";

if(!regexValidator.alphaNumbericSixCharacters(input)){

    String inputErr = "Only alphanumeric inputs are allowed.";
}



//This input will be valid because it contains alphanumeric characters and it's length is only up to four characters long.
String input = "1abc";

if(!regexValidator.alphaNumbericSixCharacters(input)){

    String inputErr = "Only alphanumeric inputs are allowed.";
}



//This input will not be valid because it's 9 characters long.
String input = "123456abc";

if(!regexValidator.alphaNumbericSixCharacters(input)){

   String inputErr = "Only alphanumeric inputs are allowed.";
}



//This input will not be valid because it's only contains digits.
String input = "12345";

if(!regexValidator.alphaNumbericSixCharacters(input)){

    String inputErr = "Only alphanumeric inputs are allowed.";
}


//This input will not be valid because it only contains letters.
String input = "abc";

if(!regexValidator.alphaNumbericSixCharacters(input)){

    String inputErr = "Only alphanumeric inputs are allowed.";
}

```



We used the RegexValidator class' alphaNumbericSixCharacters() method to validate the input field. The code below shows the alphaNumbericSixCharacters() method of the RegexValidator class:

```java

    public boolean alphaNumbericSixCharacters(String x){
    
        return Pattern.matches("\\w{6}", x);
    }
    
```




# Check if input string contains only numbers. Decimal numbers are accepted.
The code below shows a way to check if the input field only contains numbers and decimals:


```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it contains only numbers.
String input = "123";

if(!regexValidator.DecimalNumber(input)){

    String inputErr = "Only numbers and decimals are allowed";
}



//This input will be valid because it is a decimal number.
String input = "123.123";

if(!regexValidator.DecimalNumber(input)){

    String inputErr = "Only numbers and decimals are allowed";
}



//This input will not be valid because it has no leading digits.
String input = ".123";

if(!regexValidator.DecimalNumber(input)){

   String inputErr = "Only numbers and decimals are allowed";
}



//This input will not be valid because it's not a proper decimal format.
String input = "12345.12345.12345";

if(!regexValidator.DecimalNumber(input)){

    String inputErr = "Only numbers and decimals are allowed";
}



```



We used the RegexValidator class' DecimalNumber() method to validate the input field. 
The code below shows the DecimalNumber() method of the RegexValidator class:

```java

    public boolean DecimalNumber(String x){
    
        return Pattern.matches("\\d+(\\.\\d+)?", x);
    }
    
```




# Check if input string contains only numbers. Numbers greater than 1,000 should have thousand separators.
The code below shows a way to check if the input field only contains numbers. It doesn't accept decimals. 
Numbers greater than 1,000 should have thousand separators.


```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it contains only numbers.
//It is less than 1,000 so it's not required to have thousand separator.
String input = "123";

if(!regexValidator.thousandsSeparator(input)){

    String inputErr = "Only numbers are allowed. Numbers greater than 1,000 should have thousand separators.";
}



//This input will be valid because it contains only numbers.
//It has a thousand separator.
String input = "1,234";

if(!regexValidator.thousandsSeparator(input)){

    String inputErr = "Only numbers are allowed. Numbers greater than 1,000 should have thousand separators.";
}



//This input will not be valid because it has decimal digits.
String input = "123.123";

if(!regexValidator.thousandsSeparator(input)){

   String inputErr = "Only numbers are allowed. Numbers greater than 1,000 should have thousand separators.";
}



//This input will not be valid because the thousand separator is in the wrong place.
String input = "1234,5";

if(!regexValidator.thousandsSeparator(input)){

    String inputErr = "Only numbers are allowed. Numbers greater than 1,000 should have thousand separators.";
}



```



We used the RegexValidator class' thousandsSeparator() method to validate the input field. 
The code below shows the thousandsSeparator() method of the RegexValidator class:

```java

    public boolean thousandsSeparator(String x){
    
        return Pattern.matches("(\\d{1,3})(\\,\\d{3})*", x);
    }
    
```




# Check if input string contains only numbers and decimals. Numbers greater than 1,000 should have thousand separators.
The code below shows a way to check if the input field only contains numbers and decimals. 
Numbers greater than 1,000 should have thousand separators.


```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it contains only numbers.
//It is less than 1,000 so it's not required to have thousand separators.
String input = "123";

if(!regexValidator.decimalsAndThousandsSeparators(input)){

    String inputErr = "Only numbers and decimals are allowed. Numbers greater than 1,000 should have thousand separators.";
}



//This input will be valid because it contains only numbers.
//It has a thousand separator.
String input = "1,234";

if(!regexValidator.decimalsAndThousandsSeparators(input)){

    String inputErr = "Only numbers and decimals are allowed. Numbers greater than 1,000 should have thousand separators.";
}



//This input will be valid because it is a decimal number.
//It is less than 1,000 so it's not required to have thousand separators on the 
//whole number part.
String input = "123.123";

if(!regexValidator.decimalsAndThousandsSeparators(input)){

   String inputErr = "Only numbers and decimals are allowed. Numbers greater than 1,000 should have thousand separators.";
}



//This input will be valid because it is a decimal number.
//It is greater than 1,000 so it's required to have thousand separators 
//on the whole number part.
String input = "1,234.123";

if(!regexValidator.decimalsAndThousandsSeparators(input)){

   String inputErr = "Only numbers and decimals are allowed. Numbers greater than 1,000 should have thousand separators.";
}



//This input will not be valid because the thousand separator is in the wrong place.
String input = "1234,5";

if(!regexValidator.decimalsAndThousandsSeparators(input)){

    String inputErr = "Only numbers and decimals are allowed. Numbers greater than 1,000 should have thousand separators.";
}



//This input will not be valid because the thousand separator is in the decimal numbers.
//It is not a proper format
String input = "12345.12,345";

if(!regexValidator.decimalsAndThousandsSeparators(input)){

    String inputErr = "Only numbers and decimals are allowed. Numbers greater than 1,000 should have thousand separators.";
}



//This input will not be valid because it contains letters.
String input = "1,2345.12345abc";

if(!regexValidator.decimalsAndThousandsSeparators(input)){

    String inputErr = "Only numbers and decimals are allowed. Numbers greater than 1,000 should have thousand separators.";
}



```



We used the RegexValidator class' decimalsAndThousandsSeparators() method to validate the input field. 
The code below shows the decimalsAndThousandsSeparators() method of the RegexValidator class:

```java

    public boolean decimalsAndThousandsSeparators(String x){
    
        return Pattern.matches("(\\d{1,3})(\\,\\d{3})*(\\.\\d+)?", x);
    }
    
```



# Check if input string contains only negative numbers.
The code below shows a way to check if the input field only contains negative numbers. It accepts decimals.
It doesn't accept thousand separators.


```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it contains only negative numbers.
String input = "-123";

if(!regexValidator.negativeNumbers(input)){

    String inputErr = "Only negative numbers and decimals are allowed.";
}



//This input will be valid because it contains only negative numbers.
//Decimals are also allowed.
String input = "-1234.1234";

if(!regexValidator.negativeNumbers(input)){

    String inputErr = "Only negative numbers and decimals are allowed.";
}



//This input will not be valid because it is not a negative number.
//It is less than 1,000 so it's not required to have thousand separators on the 
//whole number part.
String input = "123.123";

if(!regexValidator.negativeNumbers(input)){

   String inputErr = "Only negative numbers and decimals are allowed.";
}



//This input will not be valid because it is not a negative number.
//It also has thousand separators, which is not allowed.
String input = "1,234.123";

if(!regexValidator.negativeNumbers(input)){

   String inputErr = "Only negative numbers and decimals are allowed.";
}



//This input will not be valid because it is not a negative number.
//It is also not a proper number format
String input = "1234,5";

if(!regexValidator.negativeNumbers(input)){

    String inputErr = "Only negative numbers and decimals are allowed.";
}



//This input will not be valid because contains letters.
String input = "-12345.12345abc";

if(!regexValidator.negativeNumbers(input)){

    String inputErr = "Only negative numbers and decimals are allowed.";
}

```



We used the RegexValidator class' negativeNumbers() method to validate the input field. 
The code below shows the negativeNumbers() method of the RegexValidator class:

```java

    public boolean negativeNumbers(String x){
    
        return Pattern.matches("\\-[1-9]+(\\.\\d+)*", x);
    }
    
```




# Check if input string contains only numbers with decimals. It should have 12 or more decimal places. Negative numbers are allowed.
The code below shows a way to check if the input field only contains numbers with decimals. It doesn't accept thousand separators. 
Decimals without whole numbers are accepted. Numbers without decimals are not accepted. Letters not accepted.


```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it contains only decimal numbers.
//It also has 12 decimal places.
String input = "123.123456789122";

if(!regexValidator.twelveOrMoreDecimalPlaces(input)){

    String inputErr = "Only decimal numbers are allowed. It should be 12 decimal places or more.";
}



//This input will be valid because it contains only decimal numbers.
//Negative whole numbers are also allowed.
//It also has 15 decimal places.
String input = "-1234.123456789122345";

if(!regexValidator.twelveOrMoreDecimalPlaces(input)){

    String inputErr = "Only decimal numbers are allowed. It should be 12 decimal places or more.";
}



//This input will be valid because it contains only decimal numbers.
//Decimal numbers without whole numbers are allowed
//It also has 15 decimal places.
String input = ".123456789122345";

if(!regexValidator.twelveOrMoreDecimalPlaces(input)){

    String inputErr = "Only decimal numbers are allowed. It should be 12 decimal places or more.";
}



//This input will not be valid because it is not has less than 12 decimal places.
String input = "123.123";

if(!regexValidator.twelveOrMoreDecimalPlaces(input)){

   String inputErr = "Only decimal numbers are allowed. It should be 12 decimal places or more.";
}



//This input will not be valid because has a thousand separator.
//It also has less than 12 decimal places.
String input = "1,234.123";

if(!regexValidator.twelveOrMoreDecimalPlaces(input)){

   String inputErr = "Only decimal numbers are allowed. It should be 12 decimal places or more.";
}



//This input will not be valid because it is not a proper number format.
String input = "1234,5";

if(!regexValidator.twelveOrMoreDecimalPlaces(input)){

    String inputErr = "Only decimal numbers are allowed. It should be 12 decimal places or more.";
}



//This input will not be valid because contains letters.
String input = "-12345.12345abc";

if(!regexValidator.twelveOrMoreDecimalPlaces(input)){

    String inputErr = "Only decimal numbers are allowed. It should be 12 decimal places or more.";
}

```



We used the RegexValidator class' twelveOrMoreDecimalPlaces() method to validate the input field. 
The code below shows the twelveOrMoreDecimalPlaces() method of the RegexValidator class:

```java

    public boolean twelveOrMoreDecimalPlaces(String x){
    
        return Pattern.matches("(\\d+)(\\.\\d{12,})|\\-[1-9]+(\\.\\d{12,})|\\.\\d{12,}", x);
    }
    
```




# Check if input string contains only decimal numbers. Whole numbers are not accepted.
The code below shows a way to check if the input field only contains decimal numbers. It accepts any number of decimal places.
Whole numbers are not accepted.

```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it contains only decimal numbers.
//It has no whole number part.
String input = ".123456789122";

if(!regexValidator.singleDotFollowedByAnyNumber(input)){

    String inputErr = "Only decimal numbers are allowed.";
}



//This input will not be valid because it contains whole number.
String input = "-1234.123456789122345";

if(!regexValidator.singleDotFollowedByAnyNumber(input)){

    String inputErr = "Only decimal numbers are allowed.";
}





//This input will not be valid because it contains whole number.
String input = "123.123";

if(!regexValidator.singleDotFollowedByAnyNumber(input)){

   String inputErr = "Only decimal numbers are allowed.";
}



//This input will not be valid because it contains whole number.
//It also has less than 12 decimal places.
String input = "1,234.123";

if(!regexValidator.singleDotFollowedByAnyNumber(input)){

   String inputErr = "Only decimal numbers are allowed.";
}



//This input will not be valid because it is not a proper number format.
String input = "1234,5";

if(!regexValidator.singleDotFollowedByAnyNumber(input)){

    String inputErr = "Only decimal numbers are allowed.";
}



//This input will not be valid because contains letters and whole numbers.
String input = "-12345.12345abc";

if(!regexValidator.singleDotFollowedByAnyNumber(input)){

    String inputErr = "Only decimal numbers are allowed.";
}

```



We used the RegexValidator class' singleDotFollowedByAnyNumber() method to validate the input field. 
The code below shows the singleDotFollowedByAnyNumber() method of the RegexValidator class:

```java

    public boolean singleDotFollowedByAnyNumber(String x){
    
        return Pattern.matches("\\.\\d+", x);
    }
    
```




# Check if input string contains only negative numbers and decimals. Positive whole numbers are not accepted. It must include thousand separators.
The code below shows a way to check if the input field only contains negative numbers and decimals. It accepts any number of decimal places.
positive whole numbers are not accepted. It must include thousand separators for numbers greater than 1,000.


```java

RegexValidator regexValidator = new RegexValidator();

//This input will be valid because it contains only negative numbers and decimals.
//It has no whole number part.
String input = "-145.123456789122";

if(!regexValidator.negativeNumbersWithThousandsSeparators(input)){

    String inputErr = "Only negative numbers and decimals are allowed. Please include thousand separators for numbers greater than 1,000";
}



//This input will be valid because it contains only negative numbers and decimals.
//There is also a thousand separator.
String input = "-1,234.123456789122345";

if(!regexValidator.negativeNumbersWithThousandsSeparators(input)){

    String inputErr = "Only negative numbers and decimals are allowed. Please include thousand separators for numbers greater than 1,000";
}





//This input will not be valid because it contains positive whole number.
String input = "123.123";

if(!regexValidator.negativeNumbersWithThousandsSeparators(input)){

   String inputErr = "Only negative numbers and decimals are allowed. Please include thousand separators for numbers greater than 1,000";
}



//This input will not be valid because it contains positive whole number.
String input = "1,234.123";

if(!regexValidator.negativeNumbersWithThousandsSeparators(input)){

  String inputErr = "Only negative numbers and decimals are allowed. Please include thousand separators for numbers greater than 1,000";
}



//This input will not be valid because it is not a proper number format.
String input = "1234,5";

if(!regexValidator.negativeNumbersWithThousandsSeparators(input)){

    String inputErr = "Only negative numbers and decimals are allowed. Please include thousand separators for numbers greater than 1,000";
}



//This input will not be valid because contains letters.
//It also has no thousand separators
String input = "-12345.12345abc";

if(!regexValidator.negativeNumbersWithThousandsSeparators(input)){

    String inputErr = "Only negative numbers and decimals are allowed. Please include thousand separators for numbers greater than 1,000";
}


//This input will not be valid because it has no thousand separator.
String input = "-12345.12345";

if(!regexValidator.negativeNumbersWithThousandsSeparators(input)){

    String inputErr = "Only negative numbers and decimals are allowed. Please include thousand separators for numbers greater than 1,000";
}

```



We used the RegexValidator class' negativeNumbersWithThousandsSeparators() method to validate the input field. 
The code below shows the negativeNumbersWithThousandsSeparators() method of the RegexValidator class:

```java

    public boolean negativeNumbersWithThousandsSeparators(String x){
    
        return Pattern.matches("\\-[1-9]{1,3}(\\,\\d{3})+(\\.\\d+)?", x);
    }
    
```




# Accept different number formats.
The code below shows a way to check for different number formats(e.g. 00000.00000, .12345, 0.12345, 00000.12345, -12345.12345)


We used the RegexValidator class' differentNumberPatterns() method to validate the input field. 
The code below shows the differentNumberPatterns() method of the RegexValidator class:

```java

   /*Regex for values:
            
          00000.00000
          .12345
          0.12345
          00000.12345
          -12345.12345
        
    */
    
    public boolean differentNumberPatterns(String x){
    
        return Pattern.matches("(\\d+)(\\.\\d{12,})|\\-[1-9]+(\\.\\d{12,})|\\.\\d{12,}", x);
    }
    
```






