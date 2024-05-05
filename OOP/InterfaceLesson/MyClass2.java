package OOP.InterfaceLesson;

public class MyClass2 implements MyInterface2{
    @Override
    public void greet(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        new MyClass2().myMethod();
    }
}
