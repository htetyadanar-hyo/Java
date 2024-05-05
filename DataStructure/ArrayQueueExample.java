package DataStructure;

import java.util.*;

public class ArrayQueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        System.out.println("Is Empty? " + q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Size is: " + q.size());
        System.out.println("Dequeue is: " + q.poll());
        System.out.println("Dequeue is: " + q.poll());
        System.out.println("Dequeue is: " + q.poll());
        System.out.println("Size is: " + q.size());
        System.out.println("Is Empty? " + q.isEmpty());
        System.out.println("Peek is: " + q.peek());

    }

}
