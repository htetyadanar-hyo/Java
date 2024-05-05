package OrderTrack;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Order {
    private ICustomer icustomer;
    private String orderNumber;
    private boolean prepaid;
    private double orderPrice;
    private LocalDate orderDate;
    private String status;

    private List<Orderline> orderLines;

    public Order(String orderNumber,boolean prepaid,double orderPrice,LocalDate orderDate,String status,ICustomer icustomer){
        this.icustomer = icustomer;
        this.orderNumber = orderNumber;
        this.prepaid = prepaid;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getTotalPrice(){
        double sum = 0;
        for(Orderline ol: orderLines){
            sum = sum + ol.getOrderLinePrice();
        }
        return sum;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public boolean getPrepaid() {
        return prepaid;
    }

    public double getCustomerPoints(){
        double points = 0.0;
        if(icustomer instanceof ACustomer){
            points = ((ACustomer) icustomer).getPoints();
        }
        return points;
    }

    public double getOrderPoints(){
        double total = 0;
        for(Orderline ol: orderLines){
            total = total + ol.getPoints();
        }
        return total;
    }

    public void setCustomerPoints(double points){
        if(icustomer instanceof ACustomer){
            ((ACustomer) icustomer).setPoints(points);
        }
    }

    public List<Orderline> getOrderLines(){
        return orderLines;
    }
}
