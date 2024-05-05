package OOP.InterfaceLesson;

import OOP.InterfaceLesson.InterfaceClosedCurve;

public class Triangle implements InterfaceClosedCurve {

    private double base;
    private double height;
    Triangle(double base, double height){
        this.base = base ;
    }

    @Override
    public double computeArea(){
        return 0.5 * base * height;
    }
}
