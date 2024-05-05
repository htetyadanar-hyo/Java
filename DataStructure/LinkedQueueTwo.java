package DataStructure;

public class LinkedQueueTwo {
        class Node {
            Object data;
            Node next;
            Node(Object item) {
                data = item;
            }
        }
        Node front, rear;
        int count;
        public void enqueue(Object item){
            Node p = new Node(item);
            if(front == null){
                front = rear = p;
            }
            else{
                rear.next = p;
                rear = p;
            }
            count++;
        }
        public Object dequeue(){
            if(isEmpty()){
                System.out.println("Q is empty");
                return null;
            }
            Object item = front.data;
            front = front.next;
            count--;
            return item;
        }
        public boolean isEmpty(){
            return (front == null);
        }

        public Object peek(){
            return front.data;
        }

        public int size(){
            return count;
        }

        public void display(){
            Node p = front;
            System.out.println("Linked Q: ");
            if(p == null){
                System.out.println("empty");
            }
            while(p != null){
                System.out.println(p.data + " ");
                p = p.next;
            }
            System.out.println();
        }
}
    class LinkedQueueDemoTwo{
        public static void main(String[] args) {
            LinkedQueueTwo q = new LinkedQueueTwo();
            System.out.println(q.isEmpty());
            q.display();
            q.enqueue('A');
            q.enqueue('B');
            q.enqueue('C');
            q.enqueue('D');
            q.display();
            q.dequeue();
            q.display();
            System.out.println(q.size());
            System.out.println(q.isEmpty());
        }
}
