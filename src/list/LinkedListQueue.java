package list;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListQueue {

    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();
        LinkedList<String> queue2 = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        System.out.println("Removed: " + queue.poll()); //Retrieves and removes the head of this queue, or returns null if this queue is empty

        System.out.println(queue);
    }
}
