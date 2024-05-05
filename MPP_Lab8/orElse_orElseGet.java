package MPP_Lab8;
import java.util.Optional;

public class orElse_orElseGet {
        public static void main(String[] args) {
            Optional<String> optionalWithValue = Optional.of("Present");
            Optional<String> emptyOptional = Optional.empty();

            // orElse example
            String result1 = optionalWithValue.orElse(expensiveOperation());
            String result2 = emptyOptional.orElse(expensiveOperation());

            // orElseGet example
            String result3 = optionalWithValue.orElseGet(() -> expensiveOperation());
            String result4 = emptyOptional.orElseGet(() -> expensiveOperation());

            //System.out.println("Result 1: " + result1); // Output: Present
            //System.out.println("Result 2: " + result2); // Output: Default (after computing expensive operation)
            //System.out.println("Result 3: " + result3); // Output: Present
            //System.out.println("Result 4: " + result4); // Output: Default (after computing expensive operation)
        }

        private static String expensiveOperation() {
            System.out.println("Computing expensive operation...");
            return "Default";
        }
}
