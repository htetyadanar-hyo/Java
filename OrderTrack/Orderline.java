package OrderTrack;

import java.util.Date;

public class Orderline {

    private Order order;
    private int quantity;
    private double price;
    private String status;
    private Date shipDate;
    private double points;

    private IProduct iproduct;

    public Orderline(Order order,int quantity,double price,String status,Date shipDate,double points,IProduct iproduct){
        this.order = order;
        this.quantity = quantity;
        this.price = price;
        this.shipDate = shipDate;
        this.status = status;
        this.points = points;
        this.iproduct = iproduct;
    }

    public double computePrice(){
        return quantity * price;
    }

    public double computePoints(){
        return quantity * points;
    }

    public double getOrderLinePrice(){
        return price;
    }

    public double getPoints(){
        return  points;
    }

    public void setPoints(double points) {
        this.points = points;
    }
}
