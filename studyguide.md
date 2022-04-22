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
- create a string object `String name1 = new String("Abel");` these are immutable
- concatenation is the joining of data and the operators used to concatenate are `+` and `+-`
- escape sequences
    - `\"` prints a double character quotation
    - `\\` prints a backslash character
    - `\n` inserts a new line
- string methods
    - `int indexOf(String str)` returns the first index of str: returns -1 if not found (starts at 0)
    - `string substring(int from, int to)` returns the substring from the beginning of the index from and ending at index to -1
    - `string substring(int from)` returns substring(fron, length())
    - `boolean equals(String other)`
    - `...`
