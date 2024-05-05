package FPP_Assignment5Day1;

public class MainShape {
    public static void main(String[] args) {
        Shape[] type = new Shape[5];
        type[0] = new Rectangle("black",2,3);
        type[1] = new Circle("white",2);
        type[2] = new Square("pink",2);
        type[3] = new Square("grey",3);
        type[4] = new Circle("pink",3.02);
        printTotal(type);
    }
    public static void printTotal(Shape[] type){
        double totalArea = 0;
        double totalPeri = 0;
        for(Shape i: type){
            totalArea = totalArea + i.calculateArea();
            totalPeri = totalPeri + i.calculatePerimeter();
        }
        System.out.println("The total area: " + totalArea);
        System.out.println("the total peri: " + totalPeri);
    }
}
