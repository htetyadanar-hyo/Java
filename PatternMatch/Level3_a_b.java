package PatternMatch;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Level3_a_b {
    private static final String VALID = "Valid Number";
    private static final String INVALID = "Invalid Number";
    private static final String STOP = "Stop";
    private static final String VALID_SOCIAL_SECURITY = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
    private static final String VALID_PHONE_NUMBER = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str, reply;
        System.out.println("Put Identifier: ");
        while (true) {
            str = scanner.next();
            if (str.equals(STOP)) break;
            //reply = mySSNMatches(str);
            reply = myPhoneNumMatches(str);
            String text = str.replaceAll("[0-9]","x");
            System.out.println(reply);
            System.out.println(text);
        }
    }
    private static String mySSNMatches(String SSN){
        Pattern pattern = Pattern.compile(VALID_SOCIAL_SECURITY);
        Matcher matcher = pattern.matcher(SSN);
        if(matcher.matches()){
            return VALID;
        } else {
            return INVALID;
        }
    }

    private static String myPhoneNumMatches(String phone){
        Pattern pattern = Pattern.compile(VALID_PHONE_NUMBER);
        Matcher matcher = pattern.matcher(phone);
        if(matcher.matches()){
            return VALID;
        }
        else{
            return INVALID;
        }
    }
}
