package InnerClasses.StaticNestedClasses;

public class C {

    C(){
        A.B b = new A.B();
        b.dosome();
    }

    public static void main(String[] args) {
        C c = new C();

    }
}
