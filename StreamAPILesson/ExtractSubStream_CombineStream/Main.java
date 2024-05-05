package StreamAPILesson.ExtractSubStream_CombineStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    //String to Character Stream
    public static Stream<Character> characterStream(String s){
        List<Character> result = new ArrayList<>();
        for(char c: s.toCharArray()) result.add(c);
        return result.stream();
    }

    public static void main(String[] args){
        Stream<Character> combined =
                Stream.concat(characterStream("Hello"),
                        characterStream("World"));
        //System.out.println(combined.collect(Collectors.toList()));
        String resultTwo = combined.map(Object::toString).collect(Collectors.joining(","));
        System.out.println(resultTwo);
    }
}
