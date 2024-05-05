package MPP_Lab7_4_Immutable;

final class Person {
    private final String NAME;
    private final int AGE;

    public Person(String NAME,int AGE){
        this.NAME = NAME;
        this.AGE = AGE;
    }
    public String getNAME(){
        return NAME;
    }

    public int getAGE(){
        return AGE;
    }
}
