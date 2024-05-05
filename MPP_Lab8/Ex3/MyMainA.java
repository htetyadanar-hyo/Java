package MPP_Lab8.Ex3;

import java.util.List;

public class MyMainA {
    public static int countWords(List<String> words,char c,char d,int len){
        return (int) words.stream()
                .filter(w -> w.length() == len)
                .filter(w -> w.contains(""+c))
                .filter(w -> !w.contains(""+d))
                .count();
    }

    public static void main(String[] args) {
        List<String> words = List.of("ace","apple","ade","abc");
        int len = 3;
        char c = 'c';
        char d = 'd';
        System.out.println(countWords(words,c,d,len));
    }
}
