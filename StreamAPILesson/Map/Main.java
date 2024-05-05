package StreamAPILesson.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Function Functional Interface - map
        List<Integer> nums = List.of(1,2,3,4);
        List<Integer> result = nums.stream()
                .map(n -> n+1)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
