{% include navigation.html %}

# Data Structures

**Links:**
[Github Repo](https://github.com/maggie3000/CSAindividualrepoTRI3)\
[Replit Runtime](https://replit.com/@MaggieKillada/CSAindividualrepoTRI3?v=1)

## Week 2 Challenges
_March 21-26_

### Challenge #1
**Calculator**\
This challenge is to create a calculator by changing RPM expressions to a calculation. This should be implemented using a stack.\
Some additional tips:
- use double conversion 
- should be able to support decimals in the input
- write power of operation
- squareroot in free text\
Some additional requirements:
- Build a calculator to process expressions and ultimately change RPN to a calculation.
- Build in Power of operator ^: 2 ^ 1 = 2, 2 ^ 2 = 4, 2 ^ 3 = 8
- Extra credit: Build variable assignment and evaluation into your expressions (a = 2; a + 1).
- Extra credit: Investigate Wikipedia article and pseudo code and try adding a SQRT(). Try building Pythagoras expression.

Method for converting RPN to result:
```
// Takes RPN and produces a final result
    private void rpnToResult() {
        // Stack used to hold calculation while process RPN
        Stack calculation = new Stack();

        // for loop to process RPN
        for (String token: reverse_polish){
            // If the token is a number
            if(!isOperator(token) && !isSeperator(token)){
                // Push number to stack
                calculation.push(token);
            }
            // else
            else{
                // Pop the two top entries
                Double token1 = Double.valueOf((String)calculation.pop());
                Double token2 = Double.valueOf((String)calculation.pop());

                // Based off of Token operator calculate result
                Double result = 0.0;

                switch (token) {
                    case "+":
                        result = token1 + token2;
                        break;
                    case "-":
                        result = token2 - token1;
                        break;
                    case "*":
                        result = token1 * token2;
                        break;
                    case "/":
                        result = token2 / token1;
                        break;
                    case "%":
                        result = token1 % token2;
                        break;
                    case "^":
                        Double value = Double.valueOf(token2);
                        for(int i = 0; i < token1 - 1; i++){
                            value *= token2;
                        }
                        result = value;
                }

                // Push result back onto the stack
                calculation.push(String.valueOf(result));
            }
        }
        // Pop final result and set as final result for expression
        this.result = Double.valueOf((String) calculation.pop());
    }
```
First, the token is identifies as either a number or an operator/seperator. In the beginning, the popped values are represented in the a double variable type. Additionally, this method utilizes the switch method and it defines the procedures to follow for each case. I also added the implementation of the case for an exponent with the use of a for loop.

## Week 1 Challenges
_March 14-19_

Linked Lists: Type of list that has has linked nodes. These are nodes that are before or after. The nodes are null if there is nothing in them. Linked Lists are commonly used for queues and stacks.\
Generic T: Represents any normal data type in Java. This can also be used for object types.

### Challenge #1
**Queue Add and Delete**\
This challenge is to create an add and delete method for a queue. The delete method should remove the head from the queue because of the procedure outlined for queues (first in first out).

Delete Method:
```
 // delete a new object at the end of a queue
    public void delete() {
        if (head == null)  // initial condition
            this.head = this.tail = tail;
        else {  // nodes in queue
            this.head = this.head.getNext();
        }
    }
```
Here, this is a static method that sets the next node to the head because it removes the head from the beginning.


### Challenge #2
**Merge 2 Queues**\
This challenge is to create a merge method that will merge 2 queues. This is similar to a merge sort because it orders the numbers in the queue.

### Challenge #3
**Build Stack and reverse Queue Order**\
This challenge is to create a Queue and reverse that queue through using a stack.

## Week 0 Challenges
_March 7-11_

### Challenge #1
**Menu**\
This challenge was to create a menu that links to the other challenges. This requires user input from the Java console in replit. Additionally, a try and catch method is necessary to stop any errors in the input.

Try and Catch:
```
try {
      Menu m = menu.get(input);
      m.getReplit().run();
      }
    catch(Exception e) {
      System.out.println("Please enter a number listed in the menu.");
    }
```
Here, the code directs the user to choose a number from the menu.


### Challenge #2
**IntByReference**\
This challenge is to switch the values of the numbers if the numbers are not in least to greatest order. This requires a toString method to display in the output and for the completion of the swapToLowHighOrder method.

ToString Method:
```
public String toString(){
      return (String.format("%d", this.value));
    }
```
The toString method helps the code to become readable.

swapToLowHighOrderMethod:
```
public void swapToLowHighOrder(IntByReference num2){
      if (num2.getValue() < this.value){
        int temp = num2.getValue();
        num2.setValue(value);
        this.value = temp;
      }
    }\
```
Here, the code swaps the values with the usage of a temporary variable. The parameter for this method is an object.


### Challenge #3
**Matrix**\
This challenge is to print out the given matrices with the following output. This code requires printing the matrices regularly and in reverse order as well.

Output:
```
Keypad:
1 2 3
4 5 6
7 8 9
  0

  0
9 8 7
6 5 4
3 2 1

Numbers Systems:
0 1
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9 a b c d e f

f e d c b a 9 8 7 6 5 4 3 2 1 0
9 8 7 6 5 4 3 2 1 0
1 0
```

ToString Method:
```
public String toString(){
      String numberString = "";
      for (int i=0; i<matrix.length; i++){
          for(int j=0; j<matrix[i].length; j++){
            if (matrix[i][j] != -1){
              numberString = numberString + matrix[i][j] + " ";
            }
            else if(matrix[i][j] > 9){
              returnStatement += Integer.toHexString(matrix[i][j]) + " "
            }
            else{
              numberString = numberString + "  ";
            }
          }
        numberString = numberString + "\n";
      }
      return numberString;
    }
```
This toString method includes a nested for loop to interate through each row of the matrix and each value in each column in the matrix. Within the nested for loop, there are several conditional statements to meet the conditions for printing in a specific format in the console window. Additionally, the requirements state that the last few digits in the matrix must be in hexcode, so the `Integer.toHexString(matrix[i][j])` is used to accomplish this.

Reverse method:
```
public String reverse(){
      String numberString = "";
      for (int i=matrix.length-1; i>=0; i--){
          for(int j=matrix[i].length-1; j>=0; j--){
            if (matrix[i][j] != -1){
              numberString = numberString + matrix[i][j] + " ";
            }
            else if(matrix[i][j] > 9){
              returnStatement += Integer.toHexString(matrix[i][j]) + " "
            }
            else{
              numberString = numberString + "  ";
            }
          }
        numberString = numberString + "\n";
      }
      return numberString;
    }
```
This reverse method is essentially the same as the toString method displayed above except for the minor changes in the conditional statements. It interates backwards, rather than incrementing.
