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
Comparison of string objects must be handled using string methods NOT using boolean expressions
.equal
.compareTo
<= → less than
>= → greater than
!= → false
== → true

## UNIT 4: Iteration
"for" loops and "while" loops

## UNIT 5: Writing Classes
Object:
Instance of a class
Constructor:
Has no return value
Has the same name as the class that it inside
Always public
Anatomy of a Class:
Private instance variables
Restrict access (read-only)
Option to provide validation checks
Default constructor
Has no parameters
For strings, parenthesis are empty
For numbers, set to 0
For boolean types, set to null
Overloaded constructor
Has different parameters
Accessor methods/functions
Always public
Mutator methods/functions
Access Modifiers:
Public access modifiers
Have no restrictions on access
Other classes can access
Private access modifiers
Restriction on access
Only access in given class
Encapsulation:
Wrap the data (variables) and code that acts on the data (methods) into one unit (class)
“Has-A”:
Each instance of a class object “has-a” private instance variable
Comments:
Ignored by compilers/interpreters
Help make code readable
Prevent execution when testing alternative code
3 types of comments
// single line comment
/* multi-line comment */
/** documentation to create Javadoc **/

## UNIT 6: Array
Data structure used to implement a collection (list) of primitive or object reference data
An element is a single value in an array
The index of the element is the position of the element in the array
In java, the first element in an array is 0
The length of an array is the number of elements in the array
Length is a public final data member of the array
Since length is public, we can access it in any class
Since length is final, we cannot change an array’s length after it has been created
In java, the last element of an array named list is at index list.length-1
Using initializer list:
Elements of an array are initialized with a specific value based on the type of elements
Elements of type int are initialized to the reference value null
Elements of type double are intialized to 0.0
Elements of type boolean are initialized to false

## UNIT 7: Arraylist
Need to import the command import java.util.ArrayList;
Array vs. ArrayList
Array
Array List
Fixed length
Fundamental java feature
An object with no methods
Not as flexible
Can store primitive data
Resizable list
Part of a framework
A class with many methods
Is designed to be flexible
Not designed to store primitives
Is slightly slower than arrays
Can only be used with an import statement
ArrayLists are collections of *object reference data*
ArrayLists are mutable (they can be changed after they’re defined!)
ArrayLists size can be changed once initialized
On the other hand, arrays are Static in size, once initialized, they cannot be changed
Creating an ArrayList:
ArrayList<DataType> variableName;
ArrayList<DataType> variableName = new ArrayList<DataType>();
ArrayList<DataType> variableName = new ArrayList<DataType>(n);
DataType can be any nonprimitive data type!
n is the initial number of elements in the ArrayList
Wrapper Class Data Types:
ArrayList objects only store references to objects, not primitive values, so the workaround is a Wrapper class
A Wrapper class stores primitive values as objects
Primitive Data Types
Wrapper Data Types
boolean
char
double
int
Boolean
Character
Double
Integer
ArrayList Methods:
ArrayList<Integer> a1 = new ArrayList<Integer>();
a1.size() returns the number of elements in the list
a1.add(5) adds another element with the value of 5 to the end of the list
a1.add(2, 5) adds another element with the value of 5 at an index of 2 in the list. Every element that was at an index of 2 or more previously gets shifted over to the right
a1.remove(2) removes the element at an index of 2
a1.remove() can also return a variable! This means we can do:
Integer thatOneThingWeRemoved = a1.remove(2);
System.out.println(thatOneThingWeRemoved);
a1.set(2, 5) sets the element at an index of 2 to 5
a1.set also returns the previous value at that index
a1.get(2) returns the element at an index of 2


## UNIT 8: 2D Array
2D Arrays:
Data split into rows and columns
Row indicates student
Column indicates test
Declaring 2D Arrays:
Declaring a 1D array
DataType [ ] name
Declaring a 2D array
DataType [ ] [ ] name
Grades example
int [ ] [ ] grades
Initializing a 2D array
new DataType [r] [c]
new int [7] [4]
Set of initializer lists
{ {“Alice”, “Rob”, “Cody”}, {“Robin”, “Becky”, “Kisha”} }
For pre-initialized array, 
Number of rows is: arrayName.length
Number of columns is: arrayName[i].length
Looping in 2D Arrays:
In a 1D array, we could use a for loop or a while loop to go through the array
In 2D arrays, we need 2 nested for loops
Ex.
for (firstDimension traversal conditions) {
  for (secondDimension traversal conditions) {
    System.out.print(item + " ");
  }
}
System.out.println();

## UNIT 9: Inheritance
Inheritance and Polymorphism:
Superclasses has common attributes and methods of subclasses which they can call upon without repeating code and/or modify
Subclasses extends superclasses, has an “”is-a” relationship
Super keyword can be used to call superclass’s constructor and methods
Constructors aren’t inherited, so if not explicitly written, java inserts super() in subclass constructor
Subclasses can override methods inherited from superclass

## UNIT 10: Recursion
Binary Sort:
Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array
If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half
Otherwise, narrow it to the upper half
 Repeatedly check until the value is found or the interval is empty
Merge Sort:
The merge() function is used for merging two halves
The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one
