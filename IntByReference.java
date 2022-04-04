/*
TITLE: Week 0 Challenge #2
AUTHOR: Maggie Killada

DIRECTIONS:
Write a Java Class with Method(s) to swap two numbers and add to Menu.
Key learning 1: Pass-by-Value and Pass-by-Reference are two key concepts when passing parameters through code,
to do a Swap you will need to consider changing value in the referenced objects.
Key learning 2: Swap is a fundamental concept when sorting data.
Key learning 3: start working with toString method, this method is used to represent data in Class using a formatted String.
Here is some starter code on creating a Class to swap values by reference by creating your own data type...
 */



public class IntByReference {
    private int value;

    // Hack: create IntByReference, swapToLowHighOrder and toString methods
    public IntByReference(int num1){
      value = num1;
    }

    public int getValue(){
      return value;
    }

    public void setValue(int num){
      this.value = num;
    }
  
    public void swapToLowHighOrder(IntByReference num2){
      if (num2.getValue() < this.value){
        int temp = num2.getValue();
        num2.setValue(value);
        this.value = temp;
      }
    }

    public String toString(){
      return (String.format("%d", this.value));
    }
  
    // static method that enables me to see numbers swapped by reference (before, after)
    public static void swapper(int n0, int n1) {
        IntByReference a = new IntByReference(n0);
        IntByReference b = new IntByReference(n1);
        System.out.println("Before: " + a + " " + b);
        a.swapToLowHighOrder(b);  // conditionally build swap method to change values of a, b
        System.out.println("After: " + a + " " + b);
        System.out.println();
    }

    // static main method that provides some simple test cases
    public static void main(String[] ags) {
        IntByReference.swapper(21, 16);
        IntByReference.swapper(16, 21);
        IntByReference.swapper(16, -1);
    }
}


/*
SAMPLE OUTPUT:

Before: 21 16
After: 16 21

Before: 16 21
After: 16 21

Before: 16 -1
After: -1 16
 */
