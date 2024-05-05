package DataStructure;

public class ArrayStack {
    private Object a[];
    private int top;
    public ArrayStack(int n){
        a = new Object[n];
        top = -1;
    }
    public void push(Object item){//push into top item
        if(top == a.length-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        a[top] = item;
    }

    public Object pop(){//remove top item of stack
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Object item = a[top];
        top--;
        return item;
    }

    public Object peek(){//get top item of stack
        if(isEmpty()){
            return null;
        }
        return a[top];
    }

    public boolean isEmpty(){//true is the stack is empty
        return (top == -1);
    }

    public int size(){//returns number of items in the stack
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayStack st = new ArrayStack(4);
        System.out.println("Pop is " + st.pop());
        System.out.println("Is Empty? " + st.isEmpty());
        st.push('A');
        st.push('B');
        st.push('C');
        st.push('D');
        System.out.println("Size is " + st.size());
        System.out.println("Pop is " + st.pop());
        System.out.println("Peek is " + st.peek());
        st.push('D');
        //st.push('E'); //stack is full and not add
        System.out.println("Pop is " + st.pop());
        System.out.println("Size is " + st.size());
    }
}
