package FPP_Assignment5Day2_3;

class CommissionEmployee extends Employee{

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales,double commissionRate){
        super(firstName,lastName,socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate / 100;
    }

    public void setGrossSales(double grossSales){
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate){
        this.commissionRate = commissionRate;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    @Override
    public double getPayment() {
        return  grossSales * commissionRate;
    }
}
