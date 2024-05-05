package OOP;
import java.time.LocalDate;
public class Employee {
    //instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;

    Employee(String name,double salary,int aYear,int aMonth, int aDay){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(aYear,aMonth,aDay);
    }

    //instance methods
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDay(){
        return hireDay;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }
}



