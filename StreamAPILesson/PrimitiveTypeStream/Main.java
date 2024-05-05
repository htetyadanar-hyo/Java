package StreamAPILesson.PrimitiveTypeStream;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream ints = IntStream.of(1,2,4,8);
        IntStream ones = IntStream.generate(()->1).limit(2);
        System.out.println(ones.boxed().collect(Collectors.toList()));
        IntStream oddNum = IntStream.iterate(1,n->n+2).limit(3);
        System.out.println(oddNum.boxed().collect(Collectors.toList()));

        IntStream zeroTONinetyNine = IntStream.range(0,100);
        IntStream zeroTo100 = IntStream.rangeClosed(0,100);

        Stream<String> words = Stream.of("Apple","Orange");
        //IntStream lengths = words.mapToInt(String::length);
        DoubleStream length = words.mapToDouble(String::length);
        //System.out.println(lengths);
        System.out.println(length.boxed().collect(Collectors.toList()));

        //toArray -> return primitive type
        //Optional -> return -> OptionalInt, OptionalLong, OptionalDouble

    }
}
