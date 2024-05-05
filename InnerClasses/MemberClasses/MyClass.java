package InnerClasses.MemberClasses;

public class MyClass {

    private String s = "hello";
    private static int test;
    MyClass(){
        MyInnerClass myinner = new MyInnerClass();
        System.out.println(myinner.intval);
        myinner.innerMethod();
    }
    private class MyInnerClass{
        private int intval = 3;

        int test2 = test;
        private void innerMethod(){
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        new MyClass();
    }
}
