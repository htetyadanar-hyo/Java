package FPP_Assignment5Day2_3;

class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;
    BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getPayment(){
        return baseSalary + super.getPayment();
    }
}
