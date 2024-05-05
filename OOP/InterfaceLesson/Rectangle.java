package OOP.InterfaceLesson;

import OOP.InterfaceLesson.InterfaceClosedCurve;

public class Rectangle implements InterfaceClosedCurve {
    double width;
    double length;

    Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double computeArea(){
        return width * length;
    }
}
