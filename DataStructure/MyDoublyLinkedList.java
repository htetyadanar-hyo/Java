package DataStructure;

public class MyDoublyLinkedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int x) {
            val = x;
        }
    }
    int numberOfNodes;
    ListNode head, tail;

    public MyDoublyLinkedList(){
        numberOfNodes = 0;
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    public void addAtHead(int val){
        ListNode pred = head;
        ListNode succ = head.next;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
        ++numberOfNodes;
    }
    public void addAtTail(int val){
        ListNode succ = tail;
        ListNode pred = tail.prev;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
        ++numberOfNodes;
    }

    public void addAtIndex(int index,int val){
        if(index > numberOfNodes) return;
        if(index < 0) index = 0;
        ListNode pred,succ;
        if(index < numberOfNodes - index){
            pred = head;
            for(int i=0; i<index; i++){
                pred = pred.next;
            }
            succ = pred.next;
        }
        else{
            succ = tail;
            for(int i=0; i < numberOfNodes-index; i++){
                succ = succ.prev;
            }
            pred = succ.prev;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
        ++numberOfNodes;
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index >= numberOfNodes){
            return ;
        }
        ListNode pred = head;
        for(int i=0; i<index; i++){
            pred = pred.next;
        }
        ListNode succ = pred.next.next;
        pred.next = succ;
        succ.prev = pred;
        --numberOfNodes;
    }

    public int get(int index){
        if(index < 0 || index >= numberOfNodes){
            return -1;
        }
        ListNode curr = head;
        if(index + 1 < numberOfNodes - index){
            for(int i=0; i < index + 1; i++){
                curr = curr.next;
            }
        }
        else{
            curr = tail;
            for(int i=0; i < numberOfNodes - index; i++){
                curr = curr.prev;
            }
        }
        return curr.val;
    }

    public boolean isEmpty(){
        return numberOfNodes == 0;
    }

    public static void main(String[] args){
        MyDoublyLinkedList list = new MyDoublyLinkedList();
        System.out.println(list.isEmpty());
        list.addAtHead(9);
        list.deleteAtIndex(0);
        list.addAtTail(4);
        list.addAtHead(2);
        list.addAtHead(3);
        list.addAtTail(5);
        System.out.println("At index 0: " + list.get(0));
        System.out.println("At index 1: " + list.get(1));
        System.out.println(list.isEmpty());

    }
}
