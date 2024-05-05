package FPP_Assignment4;

public class ReverseInteger {

    public static void main(String[] args) {
        int n = 123;
        reverse(n);
    }
    static void reverse(int n){
        if(n < 10 ){
            System.out.println(n);
            return;
        }
        System.out.println(n%10);
        reverse(n/10);
    }
}
