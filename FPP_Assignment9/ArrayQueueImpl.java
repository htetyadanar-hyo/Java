package FPP_Assignment9;

public class ArrayQueueImpl {
        private int[] arr = new int[10];
        private int front = -1;
        private int rear = 0;
        public int peek() {
            if(isEmpty()){
                return -1;
            }
            return arr[front+1];
//implement
        }
        public void enqueue(int obj){
//implement
            if(rear == arr.length){
                resize();
            }
            rear++;
            arr[rear-1] = obj;
        }
        public int dequeue() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            front++;
            int item = arr[front];
            return item;
//implement
        }
        public boolean isEmpty(){
//implement
            return (rear-front-1 <= 0);
        }
        public int size(){
//implement
            if(isEmpty()){
                return 0;
            }
            return rear-front-1;
        }
        private void resize(){
//implement
            System.out.println("Resizing");
            int len = arr.length;
            int newlen = 2*len;
            int[] newArr = new int[newlen];
            System.arraycopy(arr,0,newArr,0,len);
            arr = newArr;
        }
}
class Main{
    public static void main(String[] args) {
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();
        System.out.println("Is Empty? " + arrayQueue.isEmpty());
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        System.out.println("Size is: " + arrayQueue.size());
        System.out.println("Dequeue is: " + arrayQueue.dequeue());
        System.out.println("Dequeue is: " + arrayQueue.dequeue());
        System.out.println("Dequeue is: " + arrayQueue.dequeue());
        System.out.println("Size is: " + arrayQueue.size());
        System.out.println("Is Empty? " + arrayQueue.isEmpty());
        System.out.println("Peek is: " + arrayQueue.peek());
    }
}