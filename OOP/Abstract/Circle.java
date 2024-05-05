package OOP.Abstract;

public class Circle extends ConcreteClosedCurve{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double computeArea(){
        return Math.PI * radius * radius;
    }
}
