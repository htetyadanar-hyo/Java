package ObjectClass;

public class TestTwo {

    private int i = 0;

    InnerTestTwo it = new InnerTestTwo();
    int k = it.j;
    class InnerTestTwo{
       private int j = 12;
    }
}
