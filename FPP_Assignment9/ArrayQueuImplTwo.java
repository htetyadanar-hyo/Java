package FPP_Assignment9;

public class ArrayQueuImplTwo {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public void enqueue(int i){
        if(rear == arr.length){
            resize();
        }
        arr[rear] = i;
        rear++;
    }

    public void resize(){
        int[] newArray = new int[arr.length*2];
        System.arraycopy(arr,0,newArray,0,arr.length);
        arr = newArray;
    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        front++;
        return arr[front];
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[front+1] ;
    }

    public boolean isEmpty(){
        return (rear==0);
    }

    public int size(){
        return rear-front-1;
    }

    public static void main(String[] args) {
        ArrayQueuImplTwo arrayQueue = new ArrayQueuImplTwo();
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
