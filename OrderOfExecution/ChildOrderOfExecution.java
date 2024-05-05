package OrderOfExecution;

public class ChildOrderOfExecution extends ParentOrderOfExecution {
    static String str;
    String instanceStr;

    static{
        str = "Hello World";
        System.out.println("Child Static block Str = " + str);
    }
    {
        instanceStr = "Hi";
        System.out.println("Child instance block Str = " + instanceStr);

        str = "11";
    }

    ChildOrderOfExecution(String s){
        super(100);
        instanceStr = s;
        System.out.println("Child constructor instancevalue = " + instanceStr);
    }

    public static void main(String[] args) {
        new ChildOrderOfExecution("HH");
    }
}
