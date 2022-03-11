package com.individual.repo.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Write a new/alternative menu using Java with a data structure, try, and catch.
Here is a sample in Python, that work off an options list. List is formatted as {0: ["Title", Method]}.
 Instead of Method you may want pass an object and have a standard method to be run,
 perhaps have a late binding Class that abstracts a required method.
 Use your learning to figure out a dynamic menu, versus fixed content menu illustrated above.
 */

public class Menuy{
    String title;
    Runnable action;

    public Menuy(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

    public String getTitle() {
        return this.title;
    }

    public Runnable getAction() {
        return this.action;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Menuy> menu = new HashMap<>();

        menu.put(1, new Menuy("Matrix", () -> Matrix.main(null) ) );
        menu.put(2, new Menuy("IntByReference", () -> IntByReference.main(null) ) );

        System.out.println("Menu:");
        for (Map.Entry<Integer, Menuy> pair : menu.entrySet()) {
            System.out.println(pair.getKey() + " ==> " + pair.getValue().getTitle());
        }

        int input = sc.nextInt();
        Menuy m = menu.get(input);
        m.getAction().run();
    }
}