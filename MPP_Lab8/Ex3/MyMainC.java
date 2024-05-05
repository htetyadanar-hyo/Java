package MPP_Lab8.Ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MyMainC {
    public static void main(String[] args) {
       List<String> words = Arrays.asList("ace","apple","Eye","ade","Eain","abc","Orange");
       //Max
       Optional<String> largest = words.stream()
               .max(String::compareToIgnoreCase);
       if(largest.isPresent()){
           System.out.println("Largest: " + largest.get());
       }

       //Min
        Optional<String> smallest = words.stream()
                .min(String::compareToIgnoreCase);
       if(smallest.isPresent()){
           System.out.println("Smallest: " + smallest.get());
       }

       //FindFirst
        Optional<String> startsWithO = words.stream()
                .filter(s->s.startsWith("O"))
                .findFirst();
       System.out.println(startsWithO.get());

       //FindAny
        Optional<String> startsWithE = words.parallelStream()
                .filter(s->s.startsWith("E"))
                .findAny();
        System.out.println(startsWithE.get());

        pickName(words,"O");
        pickNameTwo(words,"I");
        pickNameThree(words,"E");
    }
    //Pick Name Method
    public static void pickName(List<String> names,String startingLetter){
        final Optional<String> foundName =
                names.stream()
                        .filter(name -> name.startsWith(startingLetter))
                        .findFirst();
        System.out.printf(String.format("A name starting with %s: %s%n",startingLetter,foundName.get()));
    }

    //PickName Method Two
    public static void pickNameTwo(List<String> names,String startingLetter){
        final Optional<String> foundName =
                names.stream()
                        .filter(name -> name.startsWith(startingLetter))
                        .findFirst();
        System.out.printf(String.format("A name starting wtih %s: %s%n",startingLetter,foundName.orElse("no name found")));
    }

    //IfPresent
    public static void pickNameThree(List<String> names,String startLetter){
        final Optional<String> foundName =
                names.stream()
                        .filter(name -> name.startsWith(startLetter))
                        .findFirst();
        foundName.ifPresent(name->System.out.println("Hello " + name));
    }
}
