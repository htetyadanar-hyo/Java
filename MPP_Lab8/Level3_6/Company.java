package MPP_Lab8.Level3_6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

//    public void print() {
//        System.out.println(name);
//        for(Department d: departments){
//            System.out.println(d);
//            d.print();
//        }
//    }
    public void print(){
        System.out.println(name);
        departments.forEach(d -> {
            System.out.println(d);
            d.print();
        });
    }
//    public void getSalary(){
//        double sum = 0;
//        for(Department d: departments){
//            sum = sum + d.getSalary();
//        }
//        System.out.println("Total Salary: " + sum);
//    }
    public void getSalary(){
        double sum = departments.stream()
                .mapToDouble(Department:: getSalary)
                .sum();
        System.out.println("Total Salary: " + sum);
    }

//    public void printReportingHierarchy(){
//        Position p = getTopExecutive();
//        for(Department department:departments){
//            Position deptHead = department.getDepartmentHead();
//            if(p.equals(deptHead)){
//                deptHead.printDownLine();
//            }
//        }
//    }
    Predicate<Position> isDeptHead =
        d -> getTopExecutive().equals(d);
    public void printReportingHierarchy(){
        departments.stream()
                .map(Department::getDepartmentHead)
                .filter(isDeptHead)
                .forEach(Position::printDownLine);
    }

//    public Position getTopExecutive(){
//        Position result = null;
//        for(Department d: departments){
//            List<Position> positions = d.getPoistions();
//            for(Position p: positions){
//                if(p.getTitle().equals("CEO")){
//                    result = p;
//                }
//            }
//        }
//        return result;
//    }
    Predicate<Position> isCEO =
            p -> p.getTitle().equals("CEO");
    public Position getTopExecutive(){
        return departments.stream()
                .flatMap(dept -> dept.getPoistions().stream())
                .filter(isCEO)
                .findFirst()
                .orElse(null);
    }
}