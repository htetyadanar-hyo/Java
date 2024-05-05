package OOP.InterfaceLesson;

import OOP.InterfaceLesson.InterfaceClosedCurve;

public class Square implements InterfaceClosedCurve {
    double side;
    Square(double side){
        this.side = side;
    }

    @Override
    public double computeArea(){
        return side * side;
    }
}
