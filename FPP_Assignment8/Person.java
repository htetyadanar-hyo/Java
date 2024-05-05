package FPP_Assignment8;

import java.util.Arrays;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last,String first,int a){
        lastName = last;
        firstName = first;
        age = a;
    }

    public String getLast(){
        return lastName;
    }

    @Override
    public String toString(){
        return "Person [lastName = " + lastName + "\n FirstName=" + firstName + "\nAge=" + age + "]";
    }
}

class MyPerson{
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int numOfElements;

    public MyPerson(){
        currentArray = new Person[INITIAL_LENGTH];
        numOfElements = 0;
    }

    public void add(Person p){
        if(p == null) return ;
        if(numOfElements == currentArray.length){
            resize();
        }
        currentArray[numOfElements] = p;
        numOfElements++;
    }

    public void resize(){
        System.out.println("Resizing");
        int len = currentArray.length;
        int newlen = 2 * len;
        Person[] newArray = new Person[newlen];
        System.arraycopy(currentArray,0,newArray,0,len);
        currentArray = newArray;
    }

    public void insert(Person p,int pos){
        if(p == null) return ;
        if(pos < 0 || pos > numOfElements) return ;
        if(numOfElements == currentArray.length){
            resize();
        }
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray,0,temp,0,pos);
        temp[pos] = p;
        System.arraycopy(currentArray,pos,temp,pos+1,currentArray.length-(pos+1));
        currentArray = temp;
        numOfElements++;
    }

    public boolean remove(Person p){
        if(numOfElements == 0) return false;
        if(p==null) return false;
        int index = -1;
        for(int i=0; i<numOfElements; i++){
            if(currentArray[i].equals(p)){
                index = i;
                break;
            }
        }
        if(index == -1) return false;
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray,0,temp,0,index);
        System.arraycopy(currentArray,index+1,temp,index,currentArray.length-(index+1));
        currentArray = temp;
        numOfElements--;
        return true;
    }

    public int size() { return numOfElements;}

    public Object clone(){
        Person[] temp = Arrays.copyOf(currentArray,numOfElements);
        return temp;
    }

    public boolean find(String lastName){
        if(lastName == null) return false;
        for(int i=0; i< numOfElements; i++){
            if(currentArray[i].getLast().equals(lastName)){
                return true;
            }
        }
        return false;
    }
    public Person get(int i){
        if(i < 0 || i >= numOfElements){
            return null;
        }
        return currentArray[i];
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i=0; i<numOfElements-1; ++i){
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[numOfElements-1] + "]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyPerson l = new MyPerson();
        l.add(new Person("Oo","Htet",27));
        l.add(new Person("Jane","Jone",29));
        l.insert(new Person("JJ","Mg",28),1);
        System.out.println("Find: " + l.find("Oo"));
        System.out.println("At index 1 is: " + l.get(1));
        l.remove(new Person("Jane","Jone",29));
        System.out.println(l.toString());
    }
}
