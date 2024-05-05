package InnerClasses.Quiz;

public class StaticNested {
    public static class MyClassTwo implements MyInterface{
        @Override
        public void doSomething(){
            System.out.println("Static Nested");
        }
    }

    public static void main(String[] args) {
        StaticNested.MyClassTwo i = new StaticNested.MyClassTwo();
        i.doSomething();
        new MyClassTwo().doSomething();
    }
}
