package PatternMatch;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Level2_3 {
    private static final String INVALID = "Invalid Format";
    private static final String STOP = "stop";
    private static final String VALID = "Valid Format";
    private static final String VALID_LICENSE_NUMBER = "[A-Z]{2}[0-9]{4}[A-Z]{3}";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str, reply;
        Matcher matcher;
        Pattern pattern = Pattern.compile(VALID_LICENSE_NUMBER);
        while(true){
            System.out.println("Identifier: ");
            str = scanner.next();
            if(str.equals(STOP)) break;
            matcher = pattern.matcher(str);
            if(matcher.matches()){
                reply = VALID;
            }
            else{
                reply = INVALID;
            }
            System.out.println(reply);
            String test = str.replaceAll("8","eight");
            System.out.println(test);
        }
    }
}
