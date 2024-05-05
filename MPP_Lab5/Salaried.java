package MPP_Lab5;

public class Salaried extends Employee{
    private double salary;

    public Salaried(int empId,double salary){
        super(empId);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(String dateRange) {
        return salary;
    }
}
