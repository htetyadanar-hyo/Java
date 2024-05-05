package InnerClasses.Quiz;

public class AnonymousClass {
    public static void main(String[] args) {
        MyInterface mi = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Anonymous Class");
            }
        };
        mi.doSomething();
    }
}
