package StreamAPILesson.peek;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        // A list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Double each number and use `peek` to log the transformation
        List<Integer> doubledNumbers = numbers.stream()
                .peek(num -> System.out.println("Original: " + num))  // Inspect before transformation
                .map(num -> num * 2)  // Double each number
                .peek(doubled -> System.out.println("Doubled: " + doubled))  // Inspect after transformation
                .collect(Collectors.toList());

        System.out.println("Final result: " + doubledNumbers);
    }
}
