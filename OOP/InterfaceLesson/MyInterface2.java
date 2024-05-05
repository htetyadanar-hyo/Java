package OOP.InterfaceLesson;

public interface MyInterface2 {
    //privat static final int num = 1000;
    static final int num = 1000;
    public abstract void greet();
    public static void myStaticMethod(){
        System.out.println("Hello");
    }

    public default void myMethod(){
        printSomething();
        myStaticMethod();
    }
    private void printSomething(){
        System.out.println("Private Method in an Interface");
    }
}
