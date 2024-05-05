package Assignment3;

import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        String myChar = input.nextLine();
        if(myChar.equals("C")){
            System.out.println("Enter the radius of circle");
            double ra = input.nextDouble();
            Circle myCircle = new Circle(ra);
            System.out.println("The are of circle is : " + myCircle.computeArea());
        }
        else if(myChar.equals("R")){
            System.out.println("Enter the width of Rectangle");
            double wd = input.nextDouble();
            System.out.println("Enter the length of Rectangle");
            double len = input.nextDouble();
            Rectangle myRectangle = new Rectangle(wd,len);
            System.out.println("The are of rectangle is : " + myRectangle.computeArea());
        }
        else if(myChar.equals("T")){
            System.out.println("Enter the base of Triangle");
            double bas = input.nextDouble();
            System.out.println("Enter the height of Triangle");
            double hei = input.nextDouble();
            Triangle myTriangle = new Triangle(bas,hei);
            System.out.println("The are of triangle is : " + myTriangle.computeArea());
        }
        input.close();

    }

}
final class Triangle {
    private final double base;
    private final double height;

    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    public double computeArea(){
        return  1/2.0 * base * height;
    }

}

final class Rectangle{
    private final double width;
    private final double length;

    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double computeArea(){
        return width * length;
    }
}

final class Circle{
    private final double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double computeArea(){
        return Math.PI * radius * radius;
    }
}