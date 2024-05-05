package OrderTrack;

import java.time.LocalDate;
import java.util.Date;

public class CorporateCust extends ACustomer{

    private String creditRating;
    private double creditLimit;

    public CorporateCust(String name,String address,String phone,double points, String creditRating, double creditLimit){
        super(name, address, phone, points);
        this.creditLimit =creditLimit;
        this.creditRating = creditRating;
    }

    @Override
    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRation(String creditRation) {
        this.creditRating = creditRation;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double generateMonthlyBill(){
        double total = 0.0;
        LocalDate today = LocalDate.now();
        for(Order o: getOrders()){
            if(!o.getPrepaid()){
                LocalDate orderDate = o.getOrderDate();
                // Calculate the difference in days between the order date and today
                long daysDifference = java.time.temporal.ChronoUnit.DAYS.between(orderDate, today);

                if (daysDifference == 31) {
                    total = total + o.getTotalPrice();
                }
            }
        }
        return total;
    }
}
