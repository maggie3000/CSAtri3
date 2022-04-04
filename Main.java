/*
TITLE: Week 0 Challenge #1
AUTHOR: Maggie Killada

DIRECTIONS:
Write a new/alternative menu using Java with a data structure, try, and catch.
Here is a sample in Python, that work off an options list. List is formatted as {0: ["Title", Method]}.
Instead of Method you may want pass an object and have a standard method to be run,
perhaps have a late binding Class that abstracts a required method.
Use your learning to figure out a dynamic menu, versus fixed content menu illustrated above.
 */

import java.util.*;

class Menu {
  String title;
  Runnable replit;

  public Menu(String title, Runnable replit) {
    this.title = title;
    this.replit = replit;
  }

  public String getTitle() {
    return title;
  }

  public Runnable getReplit() {
    return replit;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Integer, Menu> menu = new HashMap<>();
    menu.put(0, new Menu("Int By Reference", () -> IntByReference.main(null)));
    menu.put(1, new Menu("Matrix", () -> Matrix.main(null)));
    menu.put(2, new Menu("Queue", () -> QueueTester.main(null)));
    menu.put(3, new Menu("Merged Queue", () -> MergedQueue.main(null)));
    menu.put(4, new Menu("Reverse Queue", () -> ReverseQueue.main(null)));
    menu.put(5, new Menu("Calculator", () -> Calculator.main(null)));
    menu.put(6, new Menu("Sorts", () -> Sorts.main(null)));


    System.out.println("Menu:");
    for (Map.Entry<Integer, Menu> pair : menu.entrySet()) {
      System.out.println(pair.getKey() + " ==> " + pair.getValue().getTitle());
    }

    // try and catch
    int input = sc.nextInt();
    try {
      Menu m = menu.get(input);
      m.getReplit().run();
      }
    catch(Exception e) {
      System.out.println("Please enter a number listed in the menu.");
    }
  }
}