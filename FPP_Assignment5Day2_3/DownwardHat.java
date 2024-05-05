package FPP_Assignment5Day2_3;

public class DownwardHat implements Figure {
    public static String name;
    public DownwardHat(String name){
        this.name = name;
    }

    @Override
    public void getFigure(){
        System.out.print("\\/");
    }

    /*public String toString(){
        return DownwardHat.name + ": ";
    }*/


}
