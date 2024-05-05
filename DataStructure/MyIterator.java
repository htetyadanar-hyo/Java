package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterator {

    public static void main(String[] args) {
        List<String> javaList = new ArrayList<>();
        javaList.add("Bob");
        javaList.add("Carol");
        javaList.add("Steve");
        System.out.println("For Each........");
        javaList.forEach( name -> System.out.println(name));

        //For Loop
        System.out.println("For Loop.......");
        for(int i=0; i< javaList.size(); i++){
            System.out.println(javaList.get(i));
        }

        //Use Iterator
        Iterator it = javaList.iterator();
        System.out.println("Iterator.......");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
