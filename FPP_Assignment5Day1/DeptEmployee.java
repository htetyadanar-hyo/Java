package FPP_Assignment5Day1;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public DeptEmployee(String name,double salary,int year,int month,int day){
        this.name = name;
        this.salary = salary;
        hireDate = LocalDate.of(year,month,day);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHireDate(LocalDate hireDate){
        this.hireDate = hireDate;
    }

    public String getName(){
        return name;
    }
    public LocalDate getHireDate(){
        return hireDate;
    }

    public double computeSalary(){
        return salary;
    }
}
