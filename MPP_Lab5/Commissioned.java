package MPP_Lab5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Commissioned extends Employee{
    private double commission;
    private double baseSalary;

    private List<Order> orders;

    public Commissioned(int empId,double commission,double baseSalary){
        super(empId);
       this.commission = commission;
       this.baseSalary = baseSalary;
       orders = new ArrayList<>();
    }

    public void addOrder(Order o){
        orders.add(o);
    }

    public List<Order> getOrders(){
        return orders;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calcGrossPay(String dateRange) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.US);
        String[] dates = dateRange.split("-");
        String startDateStr = dates[0];
        String endDateStr = dates[1];
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);
        LocalDate endDate = LocalDate.parse(endDateStr, formatter);
        double totalOrder = 0.0;
        for(Order o:orders){
            if(!o.getOrderDate().isBefore(startDate) && !o.getOrderDate().isAfter(endDate)){
                totalOrder = totalOrder + o.getOrderAmount();
            }
        }
        return baseSalary +  commission * totalOrder;
    }
}
