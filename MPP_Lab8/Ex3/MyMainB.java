package MPP_Lab8.Ex3;

import java.util.stream.Stream;

public class MyMainB {
    public static void main(String[] args) {
//        Stream<String> strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
//        System.out.printf("%s %n",
//                strings.reduce("",(str1,str2) -> str1.isEmpty() ? str2 : str1 + " " + str2));

        Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
//        String result = (String) strings.reduce(
//                "",(str1,str2) -> str1.equals("") ? str2 : str1 + " " + str2
//        );

        String resultTwo = (String) strings.reduce(
                "",(str1,str2)->str1.equals("") ? str2: str1 + " " + str2
        );

        //System.out.println(result);
        System.out.println(resultTwo);
    }
}
