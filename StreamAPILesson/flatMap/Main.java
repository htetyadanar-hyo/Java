package StreamAPILesson.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Joe","Tom","Abe");
        Stream<Character> flatResult = list.stream()
                .flatMap(s-> characterStream(s));
        System.out.println(flatResult.collect(Collectors.toList()));
    }
    public static Stream<Character> characterStream(String s){
        List<Character> result = new ArrayList<>();
        for(char c: s.toCharArray()) result.add(c);
        return result.stream();
    }

//    public Position getTopExecutive(){
//        return departments.stream()
//                .flatMap(dept -> dept.getPoistions().stream())
//                .filter(isCEO)
//                .findFirst()
//                .orElse(null);
//    }
}
