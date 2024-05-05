package MPP_Lab8;

import java.util.Arrays;

public class DeclarativeExample {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int sumOfEven = Arrays.stream(num)
                              .filter(n -> n %2 == 0)
                              .sum();
        System.out.println("Sum of even Number is :" + sumOfEven);

    }
}
