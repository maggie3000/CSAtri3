/*
HELPER CODE
 */

//  Implementation of a Double Linked List;  forward and backward links point to adjacent Nodes.

public class LinkedList<T> {
    private T data;
    private LinkedList<T> prevNode, nextNode;

    //  Constructs a new element
    public LinkedList(T data, LinkedList<T> node) {
        this.setData(data);
        this.setPrevNode(node);
        this.setNextNode(null);
    }

    // Clone an object
    public LinkedList(LinkedList<T> node) {
        this.setData(node.data);
        this.setPrevNode(node.prevNode);
        this.setNextNode(node.nextNode);
    }

    // Setter for T data in DoubleLinkedNode object
    public void setData(T data) {
        this.data = data;
    }

    // Returns T data for this element
    public T getData() {
        return this.data;
    }

    //  Setter for prevNode in DoubleLinkedNode object
    public void setPrevNode(LinkedList<T> node) {
        this.prevNode = node;
    }

    //  Setter for nextNode in DoubleLinkedNode object
    public void setNextNode(LinkedList<T> node) {
        this.nextNode = node;
    }


    //  Returns reference to previous object in list
    public LinkedList<T> getPrevious() {
        return this.prevNode;
    }

    //  Returns reference to next object in list
    public LinkedList<T> getNext() {
        return this.nextNode;
    }
}