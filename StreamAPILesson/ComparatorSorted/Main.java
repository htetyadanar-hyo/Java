package StreamAPILesson.ComparatorSorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Sort by Descending lengths of words
        List<String> words = Arrays.asList("Tom","Joseph","Richard");
        Stream<String> result = words.stream()
                .sorted((String x,String y)->{
            return new Integer(y.length()).compareTo(new Integer(x.length()));
        });
        System.out.println(result.collect(Collectors.joining(",")));

        Stream<String> resultTwo = words.stream().sorted(Comparator.comparing(String::length).reversed());
        System.out.println(resultTwo.collect(Collectors.joining(",")));

    }
}
