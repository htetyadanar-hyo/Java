package OOP.Abstract;

public class Square extends ConcreteClosedCurve{
    double side;
    Square(double side){
        this.side = side;
    }

    @Override
    public double computeArea(){
        return side * side;
    }
}
