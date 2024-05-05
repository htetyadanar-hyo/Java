package OrderTrack;

public class Product implements IProduct {

    private String description;
    private String productNumber;
    private double price;

    private ICompPoints icompoints;

    public Product(String description,String productNumber,double price,ICompPoints icompoints){
        this.description = description;
        this.productNumber = productNumber;
        this.price = price;
        this.icompoints = icompoints;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
