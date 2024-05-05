package FPP_Assignment5Day2_3;

class HourlyEmployee extends Employee{
    double wage;
    double hours;

    public HourlyEmployee(String firstName,String lastName,String socialSecurityNumber,double wage,double hours){
        super(firstName,lastName,socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double getPayment() {
        return wage * hours;
    }
}
