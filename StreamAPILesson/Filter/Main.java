package StreamAPILesson.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Predicate Functional Interface - Filter
        List<String> words = Arrays.asList("abc","aed","aoc","aibld");
        long countResult = words.stream()
                .filter(w -> w.contains("" +'c'))
                .filter(w -> !w.contains("" + 'd'))
                .count();
        System.out.println(countResult);
    }
}
