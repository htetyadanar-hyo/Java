package DataStructure;

import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,Empl> tm = new Hashtable<Integer, Empl>();
        tm.put(1, new Empl(134,"Ramu",3000));
        tm.put(5, new Empl(235,"Jony",6000));
        tm.put(3, new Empl(876,"Crish",2000));
        tm.put(4, new Empl(512,"Tom",2400));
        //tm.put(null,null);
        System.out.println("HashTable entries: ");
        Set<Integer> keys = tm.keySet();
        for(Integer key: keys){
            System.out.println(key + " ==> " + tm.get(key));
        }
        tm.remove(4);
        tm.replace(5, new Empl(235,"Jony",3200));
       System.out.println(tm);


       Set<Integer> keyTwo = tm.keySet();
       for(Integer k: keyTwo){
           System.out.println(tm.get(k));
       }
    }
}
class Empl{
    private String name;
    private int salary;
    private int id;
    public Empl(int id,String n,int s){
        this.id = id;
        this.name = n;
        this.salary = s;
    }
    public String toString(){
        return id + "," + name + "," + salary;
    }
}
