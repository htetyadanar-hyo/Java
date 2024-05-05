package MPP_Lab7_4_enum;

public class Shirt {
    private String color;
    private String brand;

    private Size size;
    public Shirt(String color, String brand,Size size ){
        this.color = color;
        this.brand = brand;
        setSize(size);
    }

    public synchronized void setSize(Size size){
        this.size = size;
    }

    public String getColor(){
        return color;
    }

    public Size getSize(){
        return size;
    }

}
