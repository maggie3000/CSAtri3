{% include navigation.html %}

# AP Exam Study Guide

## Notes By Topic

### UNIT 1: Primitive Types
- class declaration `public class HelloWorld{}`
- `System.out.print()` and `System.out.println()` will print to console, however println will print the next line after on a new line in console
- a string literal is enclosed in double quotes
- 3 types of errors
    - syntax.compilation error: when you type the code wrong, like a typo
    - exception: when the process terminates unexpectedly (ex. attempting to divide by 0)
    - logic error: program runs, but not as intended (ex. using a - instead of a + to add)
- primitive types
    - boolean: true/false
        - ex. yes or no
    - int: numbers, specifically integers & whole numbers
        - ex. phone numbers, years, id numbers, percent grades
        - integer values in java use 4 bytes of memory
    - double: decimals numbers
        - ex. pi, division, money, scores
    - string: order of specific characters 
        - ex. names, notes, addresses, places
- variables
    - memory location used to hold a value
    - declare variable type `double avgGrade;`
    - setting a value to a variable `avgGrade = 92.6`
    - declaring a constant `final int numClasses = 4`
- operations
    - addition: `+`
    - subtraction: `-`
    - multiplication: `*`
    - division: `/`
    - modulus: `%`
    - there is operator presidence
    - compound assignment operators
        - addition: `x += 7` → x = x +7
        - subtraction: `x -= 7` → x = x -7
        - multiplication: `x *= 7` → x = x *7
        - division: `x /= 7` → x = x /7
        - modulus: `x %= 7` → x = x %7
        - you can't creat compound expressions
    - increment/decrement operators
        - `++` is for increment
        - `--` is for decrement

### UNIT 2: Objects
- Java is an object oriented programming language
    - a class can be used to define data types or to create blueprints for objects
    - an object is created from a class, resulting in an instance of a class
    - attributes for the properties of the objects called instance variables
- constructors are used to intialize the attributes for an object
```
public Person(String nm, int ag, boolean ad){
name = nm;
age = ag;
isAdult = ad;
}
```
- create an object using the new key keyword followed by the class name `Dog graceDog = new Dog("Grace", "lab", "1);`
- we can have more than one constructor for an object, this is called overloading the constructor
- a zero-argument constructor has no parameters and sets the instance variables for the object to default values
- methods are like functions
    - to call a method use the object name "dot" method name `lamp.turnOn();`
    - methods can also be overloaded
    - void methods do not return any value while a non-void methods do and they specify the return type in the signature
- concatenation is the joining of data and the operators used to concatenate are `+` and `+-`
- escape sequences
    - `\"` prints a double character quotation
    - `\\` prints a backslash character
    - `\n` inserts a new line
- string methods
    - `int indexOf(String str)` returns the first index of str: returns -1 if not found (starts at 0)
    - `string substring(int from, int to)` returns the substring from the beginning of the index from and ending at index to -1
    - `string substring(int from)` returns substring(fron, length())
    - `boolean equals(String other)` returns true if this is equal to other, returns false otherwise
    - `int compareTo(String other)` return a value <0 if this is less than other; returns zero if this is equal to other; returns a value >0 if this is greater than other
- wrapper classes
    - create a string object `String name1 = new String("Abel");` these are immutable
    - create an integer object `Integer num1 = new Integer(157);`
    - create a double object `Double score1 = new Double(32.78);`
- math class
    - `static int abs(int x)` returns the absolute value of an int value
    - `static double abs(double x)` returns the absolute value of a double value
    - `static double pow(double base, double exponent)` returns the value of the first parameter raised to the second parameter
    - `static double sqrt(double x)` returns the positive square root of a double value
    - `static double random(double x)` returns a double value greater than or equal to 0.0 and less that 1.0
    - `Math.random()` returns a double value greater than or equal to 0.0 and less than 1.0
        - `System.out.println(Math.random());` sample output: `0.243295832740823`
        - `System.out.println(Math.random()*10);` sample output: `5.66065679203163`
        - `System.out.println((int)(Math.random()*100);` output: `0-99(inclusive) or 0-100(exclusive)`
        - `System.out.println((int)(Math.random()*100+1);` output: `0-100(inclusive)`

## UNIT 3: Boolean Expressions and if Statements
