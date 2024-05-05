package OrderOfExecution;

public class Parent {
    static{
        System.out.println("Parent Static Block");
    }
    {
        System.out.println("Parent instance block");
    }
}

class Child extends Parent{
    static{
        System.out.println("Child Static Block");
    }
    {
        System.out.println("Child instance block");
    }

    public static void main(String[] args) {

    }
}