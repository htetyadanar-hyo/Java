package MPP_Lab7_1_3;

import java.time.LocalDate;
import java.util.Objects;


public class Employee implements Cloneable{
    private int employeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private LocalDate birthDate;
    private String SSN;
    private double salary;

    private Position position;

    public Employee(int employeeId, String firstName, String middleInitial, String lastName, int year, int month, int day,String SSN, double salary, Position position){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(year,month,day);
        this.SSN = SSN;
        this.salary = salary;
        this.position = position;
    }
    public void print(){
        System.out.println(this);
    }

    public double getSalary(){
        return salary;
    }
    @Override
    public boolean equals(Object e){
        if(this == e) return true;
        if(e == null) return false;
        if(this.getClass() != e.getClass()) return false;
        Employee employee = (Employee) e;
        boolean isEqual = employeeId==employee.employeeId;
        return isEqual;
    }

    @Override
    public int hashCode(){
        return Objects.hash(employeeId);
    }

    @Override
    public String toString(){
        return "Type: Employee, EmployeeID: " + employeeId + ", FirstName: " + firstName + ", MiddleInitial: " + middleInitial
                + ", LastName: " + lastName + ", BirthDate: " + birthDate + ",SSN: " +
                SSN + ", Salary: " + salary;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Employee copy = (Employee) super.clone();
        copy.position = (Position) position.clone();
        return copy;
    }
}
