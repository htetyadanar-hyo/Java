package MPP_Lab8.Level3_5;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Person> personLists;
    public Department(String name){

        this.name = name;
        personLists = new ArrayList<>();
    }

    public void addPerson(Person person){
        personLists.add(person);
    }
//    public double getTotalSalary(){
//        double sum = 0;
//        for(Person p: personLists){
//            sum = sum + p.getSalary();
//        }
//        return sum;
//    }
    public double getTotalSalary(){
        return personLists.stream()
                .mapToDouble(Person::getSalary)
                .sum();
    }
//    public void showAllMembers(){
//        for(Person p: personLists){
//            System.out.println(p);
//        }
//    }
    public void showAllMembers(){
        personLists.stream()
                .forEach(x -> System.out.println(x));
    }
//    public void unitsPerFaculty(){
//        for(Person p: personLists){
//            if(p instanceof Faculty){
//                Faculty f = (Faculty) p;
//                System.out.println(f.getName() + " Total Number of Units: " + f.getTotalUnits());
//            }
//        }
//    }

    public void unitsPerFaculty(){
        personLists.stream()
                .filter(p -> p instanceof Faculty)
                .map(p -> (Faculty) p)
                .forEach(f -> System.out.println(f.getName()+ " Total Number of Units: " + f.getTotalUnits()));
    }

}
