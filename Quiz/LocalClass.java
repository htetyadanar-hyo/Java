package InnerClasses.Quiz;

public class LocalClass {
    public static void main(String[] args) {
        class MyClassThree implements MyInterface{
            @Override
            public void doSomething(){
                System.out.println("Local Inner Class");
            }
        }
        MyClassThree mc = new MyClassThree();
        mc.doSomething();
    }
}
