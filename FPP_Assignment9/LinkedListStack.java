package FPP_Assignment9;

public class LinkedListStack {
    class Node{
        Object data;
        Node next;
        Node(Object data){
            this.data = data;
        }
    }
    Node top;
    int count;
    public void push(Object item){
        Node p = new Node(item);
        if(top == null){
            top = p;
        }
        else{
            Node oldOne = top;
            top = p;
            top.next = oldOne;
        }
        count++;
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Object item = top.data;
        top = top.next;
        count--;
        return item;
    }

    public Object peek(){
        return top.data;
    }

    public boolean isEmpty(){
        return (top==null);
    }

    public int size(){
        return count;
    }
}
class MainTwo{
    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();
        System.out.println("Pop is " + s.pop());
        System.out.println("Is Empty? " + s.isEmpty());
        s.push('A');
        s.push('B');
        s.push('C');
        s.push('D');
        System.out.println("Size is " + s.size());
        System.out.println("Pop is " + s.pop());
        System.out.println("Peek is " + s.peek());
        s.push('D');
        //s.push('E');
        System.out.println("Pop is " + s.pop());
        System.out.println("Size is " + s.size());
    }
}