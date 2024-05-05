package OOP;

public class MyConcrete extends MyAbstract {
    MyConcrete(int value){
        super(value);
    }

    @Override
    public void abstractMethod(){
        System.out.println("Implementation of the abstract method");
    }

    public static void main(String[] args) {
        MyConcrete.staticMethod();

        MyConcrete c = new MyConcrete(12);
        c.instanceMethod();
    }
}
