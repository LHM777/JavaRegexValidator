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



