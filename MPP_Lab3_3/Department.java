package MPP_Lab3_3;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;
    private Company company;
    private List<Position> poistions;

    public Department(String name,String location,Company company){
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

    public List<Position> getPoistions() {
        return poistions;
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

    public Position getDepartmentHead(){
        Position result = null;
        for(Position p: poistions){
            if(p.getSuperior() == null){
                result = p;
            }
        }
        return result;
    }

    public void printReportingHierarchy(){

    }

}
