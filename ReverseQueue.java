/*
TITLE: Week 1 Challenge #3
AUTHOR: Maggie Killada

DIRECTIONS:
Build a stack and use it to reverse the order of a Queue. 
FYI, here is an implementation of Stack without Generic T and Iterable.
(https://github.com/nighthawkcoders/nighthawk_csa/blob/master/src/main/java/com/nighthawk/csa/utility/LinkedLists/Stack.java)
//(Head) 1 -> 2 -> 3 -> nil
// Print out the following:
//1 2 3

// Place elements from Queue to Stack
//(Top) 3 -> 2 -> 1 -> nil

// Print out the following:
//3 2 1
*/

public class ReverseQueue {
// Place elements into Queue

    public static void main(String[] args) {
        //Object[] numbers1 = new Integer[]{1, 4, 5, 8};
        //QueueManager qNums1 = new QueueManager("num1", numbers1);

        //creating queue
        Queue queue = new Queue<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        //printing queue
        for (Object data : queue)
            System.out.print(data + " ");
        System.out.println("");


        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.toString());
    }
}


/*
SAMPLE OUTPUT:
1 2 3
3 2 1
 */