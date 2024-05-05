package StreamAPILesson.Creating_InfiniteStream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Creating Streams
        int[] nums = {1,2,3,4,5};
        Stream<int[]> strOfNums = Stream.of(nums);
        Stream<String> song = Stream.of("gently","down","the","stream");

        //Creating Infinite Streams
        //Two ways to obtain infinite stream : Generate and Iterate
        //Supplier Functional Interface -> generate / get
        Stream<String> echoes = Stream.generate(()->"echo").limit(2);
        Stream<Double> randoms = Stream.generate(Math::random).limit(2);
        System.out.println(randoms.collect(Collectors.toList()));
        System.out.println(song.collect(Collectors.toList()));
        System.out.println(echoes.collect(Collectors.toList()));

        //UnaryOperator Functional Interface -> iterate -> apply
        Stream<Integer> evenNum = Stream.iterate(0,n -> n+2).limit(3);
        String evenResult = evenNum.map(Object::toString).collect(Collectors.joining(","));
        //System.out.println(evenNum.collect(Collectors.toList()));
        System.out.println(evenResult);

    }
}
