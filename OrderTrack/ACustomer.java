package OrderTrack;

import java.util.ArrayList;
import java.util.List;

public abstract class ACustomer implements ICustomer {
    private String name;
    private String address;
    private String phone;
    private double points;

    private List<Order> orders;

    public ACustomer(String name,String address,String phone,double points){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.points = points;
        orders = new ArrayList<>();
    }
    public abstract String getCreditRating();

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public List<Order> getOrders() {
        return orders;
    }

}
