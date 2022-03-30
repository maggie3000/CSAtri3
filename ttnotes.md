{% include navigation.html %}

# Tech Talk Notes
In this section, I will take notes before and during tech talks about the topics that will be discussed in class as a group. I will come prepared with questions and present them to the next meeting.


## Tech Talk 0 ([Data Structures](https://github.com/nighthawkcoders/nighthawk_csa/wiki/Tri-3:-Tech-Talk-0---Data-Structures))

### Data Structures
Some common data structures that java uses to store information include: Array lists, hashmaps, and algorithms (such as recursion).

### Paradigms
Paradigms are a strategy to be followed for writing software applications
- **Imperative paradigms:** Uses statements to change a program’s state. Imperative programs are built from procedures and a series of commands to perform a task.
- **Object Oriented paradigms:** Uses classes as blueprints to make objects out of. These class structures can be reused, and Java follows Object Oriented Programming


## Tech Talk 1 ([Linked Lists](https://github.com/nighthawkcoders/nighthawk_csa/wiki/Tri-3:-Tech-Talk-1:-Linked-Lists-Part-2))

### Linked Lists
- linked lists are way of keeping and managing a list of Objects

### Queues
- **FIFO:** first in first out
- nodes
    - **tail node:** the last object of the list
    - **head node:** the first object of the list
    - **current node:** must be kept track of for iteration
- enqueue and dequeue
    - **enqueue:** increases the queue from the tail node
    - **dequeue:** decreases the queue from the head node
- the previous node or the last node is null if something isn't there

### Stacks
- **LIFO:** last in first out
- push and pop
   - **push:** adds new node to the top of the stack
   - **pop:** removes node from the top of the stack


## Tech Talk 2 ([Calculator](https://github.com/nighthawkcoders/nighthawk_csa/wiki/Tri-3:-Tech-Talk-2:-Calculator))

### Reverse Polish Notation (RPN)
- used when calculators were first developing
- syntax is to input the numbers first then input the operator next
- this will calculate using a stack


## Tech Talk 3 ([Sorts](https://github.com/nighthawkcoders/nighthawk_csa/wiki/Tri-3:-Tech-Talk-3:-Sorts))

### Selection Sort
- linear sort algorithm that sorts elements from index [0] to [n-1]
- has a second inner loop inside the loop that compares two elements and notes which is the smallest, after cycling to the end, it swaps the smallest number to the lowest element in the round

### Insertion Sort
- linear sort algorithm that sorts elements from index [0] to [n-1]
- the inner loop of the algorithm finds the gap (which is the insertion point for the next item) and inserts the element
- each inner loop leaves the list partially sorted according to the outer loops index

### Merge Sort
- divide-and-conquer algorithm, not linear (like the selection sort or the insertion sort)
- involves cascading and inverted assembly
- divides the array into two different groups recursively, until it gets only two to compare, swaps if necessary
- then exits recursion and puts each split group back together using a sorted comparison
