package StreamAPILesson.Collecting;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple","Orange","mango");

        //Collecting into an array
        //String[] result = words.stream().toArray(String[]::new);

        //Collection into a List
        //List<String> resultTwo = words.stream().collect(Collectors.toList());

        //Collection into a Set
        //Set<String> resultThree = words.stream().collect(Collectors.toSet());

        //Collection int a TreeSet
        //TreeSet<String> resultFour = words.stream().collect(Collectors.toCollection(TreeSet::new));
        //System.out.println(resultFour);

        //Collect all strings in a stream by concatenating
        String result = words.stream().map(Object::toString).collect(Collectors.joining(","));
        //System.out.println(result);
    }


}
