package MPP_Lab3_1_2;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartments(Department d) {
        departments.add(d);
    }

    public void print() {
        System.out.println(name);
        for(Department d: departments){
            System.out.println(d);
            d.print();
        }
    }
    public void getSalary(){
        double sum = 0;
        for(Department d: departments){
            sum = sum + d.getSalary();
        }
        System.out.println("Total Salary: " + sum);
    }
}