package StreamAPILesson.SummaryStatistics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> words = Arrays.asList(1,2,3,4,5,6,7);
        IntSummaryStatistics summary =
                words.stream()
                        .mapToInt(Integer::intValue)
                        .summaryStatistics();
        System.out.println(summary.getMax());
        System.out.println(summary.getAverage());
        System.out.println(summary.getMin());

        List<String> strs = Arrays.asList("Apple","Orange","Banana");
        IntSummaryStatistics summaryTwo =
                strs.stream()
                        .collect(Collectors.summarizingInt(String::length));
        System.out.println(summaryTwo.getMin());
        System.out.println(summaryTwo.getAverage());
        System.out.println(summaryTwo.getSum());
    }
}
