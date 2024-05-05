package InnerClasses.LocalClasses;

//b & z is local variable and cannot change
public class A {

    int a = 10;
    void myMethod(int z){
        int b = 20;
        //Cannot change b, even though it doesn't mention as final.
        //b = 10;

        //If you don't use this local var in nested loop B, it is okay, we can change.
        int c = 12;
        c = 10;

       // int x = 100;
        class B{
            void print(){
                int x = 200;
                x = 400;
              //  System.out.println("Inside B outher class X: " + A.this.x);
                System.out.println(a + b + z);
            }
        }
    }
}
