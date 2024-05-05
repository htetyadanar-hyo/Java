package MPP_Lab7_4_enum;

public class Main {
    public static void main(String[] args) {
        System.out.println(Size.LARGE);

        Shirt myshirt = new Shirt("Black","Dior",Size.LARGE);
        double salesPrice = 100;
        if(myshirt.getSize() == Size.LARGE){
            salesPrice = salesPrice - applyDiscount();
        }
        System.out.println(salesPrice);
    }
    public static double applyDiscount(){
        return 10;
    }
}
