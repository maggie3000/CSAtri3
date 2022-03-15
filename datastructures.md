{% include navigation.html %}

# Data Structures

*Links:*
[Github Repo](https://github.com/maggie3000/CSAindividualrepoTRI3)
[Replit Runtime](https://replit.com/@MaggieKillada/CSAindividualrepoTRI3?v=1)

## Week 1 Challenges
_March 14-19_\

*Linked Lists:* ...\
*Generic T:* ...

### Challenge #1
*Queue Add and Delete*\
This challenge...

### Challenge #2
*Merge 2 Queues*\
This challenge...

### Challenge #3
*Build Stack and reverse Queue Order*\
This challenge...

## Week 0 Challenges
_March 7-11_

### Challenge #1
*Menu*\
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
*IntByReference*\
This challenge is to switch the values of the numbers if the numbers are not in least to greatest order. This requires a toString method to display in the output and for the completion of the swapToLowHighOrder method.

ToString Method:
```
public String toString(){
      return (String.format("%d", this.value));
    }
```

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
*Matrix*\
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
            else{
              numberString = numberString + "  ";
            }
          }
        numberString = numberString + "\n";
      }
      return numberString;
    }
```

Reverse method:
```
public String reverse(){
      String numberString = "";
      for (int i=matrix.length-1; i>=0; i--){
          for(int j=matrix[i].length-1; j>=0; j--){
            if (matrix[i][j] != -1){
              numberString = numberString + matrix[i][j] + " ";
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
