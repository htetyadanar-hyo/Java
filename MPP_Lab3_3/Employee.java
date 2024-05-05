package MPP_Lab3_3;

import java.time.LocalDate;


public class Employee {
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
        System.out.println("Type: Employee, EmployeeID: " + employeeId + ", FirstName: " + firstName + ", MiddleInitial: " + middleInitial
                + ", LastName: " + lastName + ", BirthDate: " + birthDate + ",SSN: " +
                SSN + ", Salary: " + salary);
    }

    public double getSalary(){
        return salary;
    }
}
