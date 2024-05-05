package MPP_Lab7_4_Immutable;

public class MainApp {
    public static void main(String[] args) {
        Person p1 = new Person("One Piece",23);
        System.out.println(p1.getNAME() + " " + p1.getAGE());

        Person p2 = new Person("JJ",28);
        System.out.println(p1.getNAME() + " " + p1.getAGE());
        System.out.println(p2.getNAME() + " " + p2.getAGE());

    }
}
