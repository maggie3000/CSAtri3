/*
TITLE: Week 2 Challenge #1
AUTHOR: Maggie Killada

DIRECTIONS: Build custom Bubble Sort, Selection Sort, Insertion Sort and Merge Sort.
Build a GitHub page that describes Sort implementations and the Big O complexity of these Sorts.
Establish analytics including: time, comparisons and swaps.
Average the results for each Sort, run each at least 12 times and 5000 elements.
You should throw out High and Low when doing analysis.
Make your final/judgement on best sort considering Data Structure loading, Comparisons, Swaps, Big O complexity, and Time.
 */

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class Sorts {
    private ArrayList<Integer> data = new ArrayList<>();
    private Duration timeElapsed;

    public Sorts(int size) {
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        Sort bubblesort = new BubbleSort();
        bubblesort.SortData(data);

        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);

        //merge sort
         start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        Sort mergesort = new MergeSort();
        mergesort.SortData(data);

        end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);

        //insertion sort
        start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        Sort selectionsort = new SelectionSort();
        selectionsort.SortData(data);

        end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    public static void main(String[] args) {
        int sum=0, time=0, TIMES=12, SIZE=5000;

        for(int i=0; i< TIMES; i++) {
            Sorts s = new Sorts(SIZE);
            for(int j = 0; j<s.getData().size(); j++) {
                // To see data, uncomment next line
                // System.out.println(s.getData());
                sum += s.getData().get(j);
            }
            System.out.println("Average random: " + sum / ((i+1)*SIZE));
            System.out.println("Nanoseconds: " + s.getTimeElapsed());
            time += s.getTimeElapsed();
        }
        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
    }
}