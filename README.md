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




# Check if input string contains only letters. It must have at least 1 character in length but no more than 6 characters long.
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

