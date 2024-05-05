package OrderOfExecution;

public class Test {

    Test(){
        System.out.println("Constructor");
    }

    static{
        System.out.println("Static block");
    }
    {
        System.out.println("Instance block");
    }

    static void main1(){
        System.out.println("Static Method");
    }
    void main2(){
        System.out.println("Instance Method");
    }

}
class ChildTest extends Test{

    ChildTest(){
        System.out.println("Child Constructor");
    }

    static{
        System.out.println("Child Static block");
    }
    {
        System.out.println("Child Instance block");
    }

    static void main1(){
        System.out.println("Child Static Method");
    }
    void main2(){
        System.out.println("Child Instance Method");
    }
//    public static void main(String[] args) {
//
//        new Test();
//        //new Test();
//        new ChildTest();
//    }
}

class Result{

    public static void main(String[] args) {
        new Test();
        new ChildTest();
    }
}
