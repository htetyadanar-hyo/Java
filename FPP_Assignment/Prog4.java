package Assignment2;

public class Prog4 {
    public static void main(String[] args) {
        float a = 1.27f;
        float b = 3.881f;
        float c = 9.6f;

        int result1 = (int) (a + b + c);
        int result2 = Math.round(a+b+c);

        System.out.println(result1);
        System.out.println(result2);
    }
}
