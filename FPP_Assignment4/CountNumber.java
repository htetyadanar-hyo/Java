package FPP_Assignment4;

public class CountNumber {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(count(n));
    }
    static int count(int n){
        if(n < 10){
            return 1;
        }
        int result = 1+count(n/10);
        return result;
    }
}
