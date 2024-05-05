package OOP.Abstract;

public class Rectangle extends ConcreteClosedCurve {
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
