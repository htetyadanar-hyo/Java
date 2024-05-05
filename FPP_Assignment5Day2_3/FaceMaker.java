package FPP_Assignment5Day2_3;

public class FaceMaker implements Figure{
    public static String name;
    public FaceMaker(String name){
        this.name = name;
    }

    @Override
    public void getFigure(){
        System.out.print(":)");
    }

    /*public String toString(){
        return FaceMaker.name + ": ";
    }*/

}
