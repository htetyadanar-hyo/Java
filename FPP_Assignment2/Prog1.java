package FPP_Assignment2;

public class Prog1 {

    public static void main(String[] args) {
        int x = RandomNumbers.getRandomInt(1,9);
        int y = RandomNumbers.getRandomInt(3,14);

        double ans1 = Math.pow(Math.PI,x);
        double ans2 = Math.pow(y,Math.PI);

        System.out.println(ans1);
        System.out.println(ans2);

    }
}
