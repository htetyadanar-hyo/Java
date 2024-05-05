package DataStructure;

import java.util.Arrays;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] currentArray;
    private int numOfElements;

    public MyStringList(){
        currentArray = new String[INITIAL_LENGTH];
        numOfElements = 0;
    }

    public void add(String s){
        if(s == null) return ;
        if(numOfElements == currentArray.length){
            resize();
        }
        currentArray[numOfElements] = s;
        numOfElements = numOfElements + 1;
    }

    public void insert(String s,int pos){
        if(s == null) return;
        if(pos > numOfElements || pos < 0) return ;
        if(numOfElements == currentArray.length){
            resize();
        }
        String[] temp = new String[currentArray.length];
        System.arraycopy(currentArray,0,temp,0,pos);
        temp[pos] = s;

        System.arraycopy(currentArray,pos,temp,pos+1,currentArray.length-(pos+1));
        currentArray = temp;
        ++numOfElements;
    }

    public boolean remove(String s){
        if(numOfElements == 0) return false;
        if(s==null) return false;
        int index = -1;
        for(int i=0; i<numOfElements; ++i){
            if(currentArray[i].equals(s)){
                index = i;
                break;
            }
        }
        if(index == -1) return false;
        String[] temp = new String[currentArray.length];
        System.arraycopy(currentArray,0,temp,0,index);
        System.arraycopy(currentArray,index+1,temp,index,currentArray.length-(index+1));
        currentArray = temp;
        --numOfElements;
        return true;
    }
    public String get(int i){
        if(i < 0 || i >= numOfElements){
            return null;
        }
        return currentArray[i];
    }

    private void resize(){
        System.out.println("Resizing");
        int len = currentArray.length;
        int newlen = 2 * len;
        String[] newArray = new String[newlen];
        System.arraycopy(currentArray,0,newArray,0,len);
        currentArray = newArray;
    }

    public boolean isEmpty(){
        return(numOfElements == 0);
    }

    public boolean find(String s){
        if(s == null) return false;
        for(int i=0; i< numOfElements; i++){
            if(currentArray[i].equals(s)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i=0; i<numOfElements-1; ++i){
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[numOfElements-1] + "]");
        return sb.toString();
    }

    public int size() { return numOfElements;}

    public Object clone(){
        String[] temp = Arrays.copyOf(currentArray,numOfElements);
        return temp;
    }

    public static void main(String[] args){
        MyStringList l = new MyStringList();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.insert("E",2);
        l.insert("G",3);
        System.out.println("Find: " + l.find("F"));
        System.out.println("At index 3: " + l.get(3));
        l.remove("G");
        l.remove("E");
        System.out.println(l.toString());
    }
}
