package OOP.InterfaceLesson;

public class InterfaceClass {
    public static void main(String[] args) {
        InterfaceClosedCurve[] shapes = {
                new Circle(4),
                new Triangle(3.0,4.0),
                new Square(5.0),
                new Rectangle(2.0,4.0)
        };
        for(InterfaceClosedCurve xx: shapes){
            System.out.println(xx.computeArea());
        }
    }
}
