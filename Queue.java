/*
TITLE: Week 1 Challenge #1
AUTHOR: Maggie Killada

DIRECTIONS:
Add and Delete elements from Queue. Working with the code that is given, 
you will need to adjust Add and write Delete, to output from the Queue as follows.
*/

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
    LinkedList<T> head, tail;

    // Add a new object at the end of the Queue
    public void add(T data) {
        // add new object to end of Queue
        LinkedList<T> tail = new LinkedList<>(data, null);

        if (head == null)  // initial condition
            this.head = this.tail = tail;
        else {  // nodes in queue
            this.tail.setNextNode(tail); // current tail points to new tail
            this.tail = tail;  // update tail
        }
    }

    // delete a new object at the front of a queue
    public void delete() {
        if (head == null)  // initial condition
            this.head = this.tail = tail;
        else {  // nodes in queue
            this.head = this.head.getNext();
        }
    }


    // Returns the head object
    public LinkedList<T> getHead() {
        return this.head;
    }

    // Returns the tail object.
    public LinkedList<T> getTail() {
        return this.tail;
    }

    // Returns the iterator object
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }
}

// Queue Iterator
class QueueIterator<T> implements Iterator<T> {
    LinkedList<T> current;  // current element in iteration

    // QueueIterator is intended to the head of the list for iteration
    public QueueIterator(Queue<T> q) {
        current = q.getHead();
    }

    // hasNext informs if next element exists
    public boolean hasNext() {
        return current != null;
    }

    // next returns data object and advances to next position in queue
    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }
}

// Queue Manager
class QueueManager<T> {
    // queue data
    private final String name; // name of queue
    private int count = 0; // number of objects in queue
    public final Queue<T> queue = new Queue<>(); // queue object

    // Queue constructor
    public QueueManager(String name) {
        this.name = name;
    }

    // Queue constructor
    public QueueManager(String name, T[]... seriesOfObjects) {
        this.name = name;
        this.addList(seriesOfObjects);
    }

    // Add a list of objects to queue
    public void addList(T[]... seriesOfObjects) {
        for (T[] objects: seriesOfObjects)
            for (T data : objects) {
                this.queue.add(data);
                this.count++;
            }
    }

    public void deleteList(T[]... seriesOfObjects){
        for (T[] objects: seriesOfObjects)
            for (T data : objects) {
                this.queue.delete();
                this.count--;
            }
    }

    // Print any array objects from queue
    public void printQueue() {
        System.out.print(this.name + " count: " + count);
        System.out.print(" data: ");
        for (T data : queue)
            System.out.print(data + " ");
        System.out.println();
    }
}

// Driver Class: tests queue with string, integers, and mixes of Classes and types
class QueueTester {
    public static void main(String[] args) {
        QueueManager myQueue = new QueueManager("Words");

        // Create iterable Queue of Words
        Object[] words = new String[] { "seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward"};
        for (Object word: words){
            System.out.println("Enqueued data: " + word);
            myQueue.addList(new Object[] {word});
            myQueue.printQueue();
        }
        for (Object word: words){
            System.out.println("Dequeued data: " + word);
            myQueue.deleteList(new Object[] {word});
            myQueue.printQueue();
        }
    }
}

/*
SAMPLE OUTPUT:
Enqueued data: seven
Words count: 1, data: seven 
Enqueued data: slimy
Words count: 2, data: seven slimy 
Enqueued data: snakes
Words count: 3, data: seven slimy snakes 
Enqueued data: sallying
Words count: 4, data: seven slimy snakes sallying 
Enqueued data: slowly
Words count: 5, data: seven slimy snakes sallying slowly 
Enqueued data: slithered
Words count: 6, data: seven slimy snakes sallying slowly slithered 
Enqueued data: southward
Words count: 7, data: seven slimy snakes sallying slowly slithered southward 
Dequeued data: seven
Words count: 6, data: slimy snakes sallying slowly slithered southward 
Dequeued data: slimy
Words count: 5, data: snakes sallying slowly slithered southward 
Dequeued data: snakes
Words count: 4, data: sallying slowly slithered southward 
Dequeued data: sallying
Words count: 3, data: slowly slithered southward 
Dequeued data: slowly
Words count: 2, data: slithered southward 
Dequeued data: slithered
Words count: 1, data: southward 
Dequeued data: southward
Words count: 0, data: null
*/