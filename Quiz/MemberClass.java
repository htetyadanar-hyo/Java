package InnerClasses.Quiz;

public class MemberClass {
    class MyClass implements MyInterface{
        @Override
        public void doSomething(){
            System.out.println("Member Class");
        }
    }

    public static void main(String[] args) {
        MemberClass mb = new MemberClass();
        mb. new MyClass().doSomething();
    }
}
