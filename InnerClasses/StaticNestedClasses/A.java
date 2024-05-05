package InnerClasses.StaticNestedClasses;

public class A {
    public static class B{
        public void dosome(){
            System.out.println("Something");
        }
    }
    public static void main(String[] args) {
//      B b = new B();
//      b.dosome();
    }
}
class D {

    D(){
        A.B b = new A.B();
        b.dosome();
    }

    public static void main(String[] args) {
        D d = new D();
    }
}
