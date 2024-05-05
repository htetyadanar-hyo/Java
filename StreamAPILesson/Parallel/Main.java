package StreamAPILesson.Parallel;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("abc","bcd");

        //Functional Style
        long count = words.stream()
                .filter(w -> w.length()>2)
                .count();
        System.out.println(count);

        //ParallelStream - Only Used in need to do in parallel processing
        long countTwo = words.parallelStream()
                .filter(w -> w.length()>2)
                .count();
        System.out.println(countTwo);
    }
}
