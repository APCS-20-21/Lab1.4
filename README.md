# Lab 1.4 ConditionDrills

## Instructions

Complete each of the methods in ConditionDrills.java so that they do what their comments say they should do.

Write code in the main method to test your methods as you complete them. It is recommended that you write one method, test it, fix it, then move on to another method.

You will be using if, else if, and else statements to solve these problems, as well as String and Math methods.

```
if( condition )
{
  // do something if true
}
```

```
if( condition )
{
  // do something if true
}
else
{
  // do something if false
}
```

```
if( condition1 )
{
  // do something if true
}
else if( condition2 )
{
  // do something if condition1 is false and condition2 is true
}
```

```
if( condition1 )
{
  if( condition2 )
  {
    // do something if both condition1 and condition2 are true
  }
}
```

You will use the comparison operators as well as the String method equals to solve these problems.

```
a is less than b                   a < b
a is greater than b                a > b
a is less than or equal to b       a <= b
a is greater than or equal to b    a >= b

a is equal to b                    a == b
a is not equal to b                a != b

String s is equal to String r       s.equals(r)
String s is not equal to String r   !s.equals(r)
```

You may also find it useful to use the boolean operators &&, ||, and !

```
A && B -> true if both A and B are true; false if either A or B is false.
A || B -> true if either A or B is true; false if both A and B are false.
!A     -> true if A is false; false if A is true.
```

One more tip, for clean code. If you find yourself writing something like this:

```
if( condition )
{
  return true;
}
else
{
  return false;
}
```

You can rewrite it like this:

```
return condition;
```

The above two code blocks do exactly the same thing, but the second code block is much less typing!

Your code must meet the following restrictions:

*  Do not use any of these methods to solve other methods.
*  Do not create any other methods to solve these methods.
*  Do not change the method headers (return type, name, parameters) of these methods.
*  Do not delete the comments from the starter code
*  Do not use loops to solve these problems.

Remember that comments describe the method that comes after them.

If you get stuck, there are hints for each method at the end of this document.

## Testing

You need to test your work! Follow this example of how to test a method:

This statement invokes the hello method and stores its response in the answer variable

```
boolean answer = isEven(705);   // invoke the isEven method and stores its response in the answer variable
System.out.println( answer );   // output the value of the answer variable to the console
```

You should write code in the main method to test each method as you write it. Follow this pattern:

* Call the method you want to test and store its return value in a variable
* Use System.out.println to output that variable

Note: Make sure you declare the variable correctly. Its type should match the return type of the method.

If you are getting compile errors for your test code in this method then check these things:

* Did you write the method name correctly? Try copying and pasting the method name from the method header.
* Are the arguments you are passing to the method correct? Look at how many parameters the method has and the types of those variables.
* Is the type of your answer variable correct? Look at the return type of the method, this should match the type of your answer variable.

## Grading

You must *correctly complete at least 8* of these methods to pass this lab. If you correctly complete *all* of these methods, then you will earn 1 Above & Beyond point.

These methods will be tested by checking their output against several test cases. If you method fails any of those test cases it will be deemed *incorrect*.

## Turning it in

When you have finished this lab, upload it to [MrMayCS.com/turnitin](http://mrmaycs.com/turnitin)

## Hints

Try to solve these methods on your own before looking at the hints.

### boolean isEven(int num)

A number is even if it is evenly divisible by 2. That means, there is no remainder when you divide an even number by 2. What math operation can you use to find out the remainder of two numbers?

### boolean isNegative(int num)

Numbers that come before 0 are negative.

### boolean isEmpty(String str)

What is the length of a string that has no characters in it?

### boolean isVowel(String letter)

Here is a neat trick. What if you had a String with the following values:

```
String vowels = "AEIOU";
```

Is there a String method you could use in combination with that *vowels* string to identify whether some other, length-1 string is a vowel or not?

If that hint doesn't help, then you can solve this problem with a bunch of if-statements.

### boolean answerPhone(boolean isMorning, boolean isMom, boolean isAsleep)

Make sure you're checking all the different cases. There are 8 different ways this method can be called! Does your code return the correct value for all of them?

### boolean tacoParty(int numTacos, boolean weekend)

Inclusive means "including". Saying something is between 10 and 20, inclusive means it includes 10 and 20.

### String middle(String str)

You need to know how long the string is so you can determine whether there are an even or odd number of characters. Then you have to do a little bit of math to find the middle. Finally, you can find the smaller string in the middle of the big string. Make sure your answer is 1 character if str is odd, and 2 characters if str is even!

### boolean sameOnes(int a, int b, int c)

What math operator can you use to isolate the ones digit of a number?

### int lotto(int a, int b, int c)

This is just a bunch of if statements. Make sure you pay attention to the order you are checking the condition.

### int smallest(int a, int b, int c)

Remember you can't write a < b < a in Java. You can only even compare 2 values at once. You have to check a < b and then check b < c.

### boolean sorted(int a, int b, int c)

You can solve this similarly to how you solved the smallest method.

### String fizzbuzz(int num)

This is just a bunch of if-statements.

### String blackjack(int one, int two)

This is just a bunch of if statements. It would help to do the calculation first and store the result in an appropriately named variable.

### int closestTo20(int one, int two)

You need to calculate the difference between 20 and *one* and the difference between 20 and *two*. Then you need to normalize both those values to make sure neither is negative (is there a Math method that can help you do that?). Then you can identify which number is closest to 20.

Make sure to handle the situation where the distance from 20 is a tie!

### boolean doubleDigits(int num)

You need to isolate the ones digit and the tens digit, then compare them to each other. What math operation can you use to isolate the ones digit? How does knowing that num is exactly 2 digits long help you to be able to isolate the tens digit?
