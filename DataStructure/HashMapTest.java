package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(3,"GG");
        map.put(2,"Ball");
        map.put(2,"BallTwo");
        map.put(null,null);

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("GG"));
        System.out.println(map.size());
        System.out.println(map.remove(2));
        System.out.println(map.get(null));
        System.out.println(map.get(2));
       // System.out.println(map.remove("Apple"));

        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println("Key: " + entry.getKey() + "-> " + entry.getValue());
        }
    }
}
