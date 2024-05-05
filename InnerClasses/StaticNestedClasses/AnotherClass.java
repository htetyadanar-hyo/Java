package InnerClasses.StaticNestedClasses;

public class AnotherClass {
    public static void main(String[] args) {
        MyClass.MyStaticNestedClass cl = new MyClass.MyStaticNestedClass();
        MyClass m = new MyClass();
        //the following is illegal -- compile error
        //MyClass.MyStaticNestedClass cl = m.new MyStaticNestedClass();
    }
}
