package OrderOfExecution;

public class ParentOrderOfExecution {

    static int value;
    int instanceValue;
    static{
        value = 10;
        System.out.println("Parent static block:" + value);
    }
    {
        instanceValue = 20;
        System.out.println("Parent instance block: " + instanceValue);
    }
    ParentOrderOfExecution(int v){
        instanceValue = v;
        System.out.println("Parent Constructor instancevalue: " + instanceValue);
    }
}
