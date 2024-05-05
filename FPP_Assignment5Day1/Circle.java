package FPP_Assignment5Day1;

class Circle extends Shape {
    double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
