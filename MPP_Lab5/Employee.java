package MPP_Lab5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private int empId;
    private List<Paycheck> paychecks;
    public Employee(int empId){
        this.empId = empId;
        paychecks = new ArrayList<>();
    }

    public void addPaycheck(Paycheck p){
        paychecks.add(p);
    }

    public List<Paycheck> getPaychecks(){
        return  paychecks;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void print(){
        for(Paycheck p: paychecks){
            p.print();
        }
    }

    public Paycheck calcCompensation(int month,int year){
        LocalDate startDate = LocalDate.of(year,month,1);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String startDateString = startDate.format(formatter);
        String endDateString = endDate.format(formatter);
        String payPeriod = startDateString + "-" + endDateString;
        return new Paycheck(calcGrossPay(payPeriod),0.23,0.05,0.01,0.03,0.075,payPeriod,this);
    }

    public abstract double calcGrossPay(String dateRange);
}
