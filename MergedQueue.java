/*
TITLE: Week 1 Challenge #2
AUTHOR: Maggie Killada

DIRECTIONS:
Challenge #2, perform a merge or combination of 2 Queue's that are ordered. 
This is a foundation step for future Merge sorting. 
IMO, this algorithm is easier if you "peek" at data at the head of the queue, 
prior to performing dequeue action.
*/

public class MergedQueue {

    public static Queue<Integer> merge(Queue<Integer> first, Queue<Integer> second){
        Queue<Integer> mergedQueue = new Queue<Integer>();

        //if both Queues are not empty
        while(first.getHead() != null && second.getHead() != null){
            //uses peek() function to look at values in the Queues
            Integer init = first.getHead().getData();
            Integer next = second.getHead().getData();

            //if the first queue has a value smaller than 2nd queue
            if(init < next){
                mergedQueue.add(init);
                first.delete();
            }
            //if second queue has a value smaller than 1st queue
            else{
                mergedQueue.add(next);
                second.delete();
            }
        }

        //if the first queue has values but second queue is empty
        while (first.getHead() != null && second.getHead() == null){
            mergedQueue.add(first.getHead().getData());
            first.delete();
        }

        //if second queue has values but first queue is empty
        while(second.getHead() != null && first.getHead() == null){
            mergedQueue.add(second.getHead().getData());
            second.delete();
        }
        //return statement
        return mergedQueue;
    }

    public static void main(String[] args){
        //creating queue1
        Queue qNums1 = new Queue<Integer>();
        qNums1.add(1);
        qNums1.add(4);
        qNums1.add(5);
        qNums1.add(8);
        //printing queue1
        System.out.print("First Queue: ");
        for (Object data : qNums1)
            System.out.print(data + " -> ");
        System.out.println("nil");

        //creating queue2
        Queue qNums2 = new Queue<Integer>();
        qNums2.add(2);
        qNums2.add(3);
        qNums2.add(6);
        qNums2.add(7);
        //printing queue2
        System.out.print("Second Queue: ");
        for (Object data : qNums2)
            System.out.print(data + " -> ");
        System.out.println("nil");

        //merging Queues
        Queue merged = MergedQueue.merge(qNums1, qNums2);

        //enhanced for loop to print values in the merged Queue
        System.out.print("Merged Queue: ");
        for (Object data : merged)
            System.out.print(data + " -> ");
        System.out.println("nil");
    }
}