package ObjectClass;

public class Testing {
    int j = 2;
  static int i = 10;
  static void doSome(){
      Testing t = new Testing();
      System.out.println("Some");
      System.out.println(t.j);
  }

    void doSome2(){
        System.out.println("Some2");
        System.out.println(i);
    }

    public static void main(String[] args) {
      Testing t = new Testing();
        int y = i;
        int z = t.j;
        doSome();
        t.doSome2();
    }
}
