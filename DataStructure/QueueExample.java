package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

//When constructing a queue you must use LinkedList instead of a new Queue because it is an interface;
public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(42);
        q.add(-3);
        q.add(17);
        System.out.println(q.remove());
    }
}
