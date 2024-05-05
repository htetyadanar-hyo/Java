package MPP_Lab5;

import java.time.LocalDate;

public class Order {
    private int orderNo;
    private LocalDate orderDate;
    private double orderAmount;

    private Employee cm;

    public Order(int orderNo,int year,int month,int day,double orderAmount,Employee cm){
        this.orderNo = orderNo;
        this.orderDate = LocalDate.of(year,month,day);
        this.orderAmount = orderAmount;
        this.cm = cm;
        Commissioned comEmployee = (Commissioned) cm;
        comEmployee.addOrder(this);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(int year,int month,int day) {
        this.orderDate = LocalDate.of(year, month, day);
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Employee getCm() {
        return cm;
    }

    public void setCm(Employee cm) {
        this.cm = cm;
    }
}
