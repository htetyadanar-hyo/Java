package MPP_Lab8.Level3_6;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private String title;
    private String description;

    private Position superior;
    private List<Position> inferiors;
    private Employee employee;

    private Department department;
    public Position(String title, String description, Department department){
        this.title = title;
        this.description = description;
        this.department = department;
        inferiors = new ArrayList<>();
    }

    public void addSuperior(Position superior){

        this.superior = superior;
    }

    public Position getSuperior(){
        return superior;
    }

    public void addInferior(Position inferior){
        inferiors.add(inferior);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addEmployee(Employee e){
        this.employee = e;
    }

    @Override
    public String toString(){
        return "Type: Position, Title: " + title + ", Description: " + description ;
    }

    public void print(){
        if(employee !=null){
            employee.print();
        }
        else{
            System.out.println("No Employee for this position!");
        }
    }

    public double getSalary(){
        if(employee == null){
            return 0.0;
        }
        return employee.getSalary();
    }

//    public void printDownLine(){
//        System.out.println("Title: " + title + ",Descripiton: " + description);
//        for(Position i: inferiors){
//            System.out.println(" ");
//            i.printDownLine();
//        }
//    }
    public void printDownLine(){
        System.out.println("Title: " + title + ",Descripiton: " + description);
        inferiors.stream().forEach(i ->
                {
                        System.out.println(" ");
                        i.printDownLine();
                }
        );
    }


}
