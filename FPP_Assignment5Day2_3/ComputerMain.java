package FPP_Assignment5Day2_3;

public class ComputerMain {

    public static void main(String[] args) {
        Computer c1 = new Computer("Microsoft","i5",16,123);
        Computer c2 = new Computer("Dell","i6",8,123);
        Computer c3 = new Computer("Microsoft","i5",16,123);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}
