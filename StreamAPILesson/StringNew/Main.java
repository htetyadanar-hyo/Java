package StreamAPILesson.StringNew;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Eleven","strikes","the","clock");
        String[] stringArr = strings.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(stringArr));

    }
}
