package MPP_Lab7_1_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department implements Cloneable {
    private String name;
    private String location;
    private Company company;
    private List<Position> poistions;

    public Department(String name, String location, Company company){
        this.name = name;
        this.location = location;
        this.company = company;
        poistions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addPosition(Position p){
        poistions.add(p);
    }

    @Override
    public String toString(){
        return "Type: Department, Name: " + name + ", Location: " + location ;
    }

    public void print(){
        for(Position p: poistions){
            System.out.println(p);
            p.print();
        }
    }

    public double getSalary(){
        double sum = 0;
        for(Position p: poistions){
            sum = sum + p.getSalary();
        }
        return sum;
    }

    @Override
    public boolean equals(Object dep){
        if(this == dep) return true;
        if(dep == null) return false;
        if(this.getClass() != dep.getClass()) return false;
        Department department = (Department) dep;
        return this.name.equals(department.name) && this.location.equals(department.location);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,location);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
