package StreamAPILesson.Reduce;

import java.util.Arrays;
import java.util.List;

public class MainTwo {

    //BinaryOperator Functional Interface - reduce
    public static void main(String[] args) {
        Double[] num = {2.0,3.0,4.0,5.0};
        List<Double> list = Arrays.asList(num);
        System.out.printf("Sum is %,.2f",
                list.stream()
                        //.sum()
                        .reduce(0.0,(x,y)->(x+y))
                        //.reduce(0.0,Double::sum)
                );
    }
}
