package FPP_Assignment5Day2_3;

class SalariedEmployee extends Employee {
    private double weeklySalary;

    SalariedEmployee(String firstName,String lastName,String socialSecurityNumber, double weeklySalary){
        super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary(){
        return weeklySalary;
    }

    @Override
    public double getPayment() {
        return weeklySalary;
    }
}
