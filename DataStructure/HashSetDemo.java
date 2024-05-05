package DataStructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Swing");
        set.add("Java Spring");
        set.add("Banana");
        set.add(null);
        System.out.println(set);
        System.out.println("Removed Java from the set " + set.remove("Java"));
        System.out.println("Set contains Swing: " + set.contains("Swing"));
        System.out.println("Size of the set : " + set.size());
        HashSet<String> obj = new HashSet<>();
        for(String s: set){
            System.out.println(s);
        }
        obj.add("Java");
        if(obj.add("Java"))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
