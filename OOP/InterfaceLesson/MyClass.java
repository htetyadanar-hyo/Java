package OOP.InterfaceLesson;

public class MyClass implements MyInterface{

    @Override
    public void myAbstractMethod(){
        MyInterface.staticMethodInsideInterface();
        myMethodWithBody();
        System.out.println("My Implementation");
    }

    public static void main(String[] args) {
        MyClass c = new MyClass();
        c.myAbstractMethod();
    }
}
