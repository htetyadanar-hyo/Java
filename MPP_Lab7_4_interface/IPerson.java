package MPP_Lab7_4_interface;

public interface IPerson {
    public default void myDefault(){
        System.out.println("From Default Method");
    }

    public static void myStatic(){
        System.out.println("From Static Method");
    }

    public abstract void myAbstract();
}
