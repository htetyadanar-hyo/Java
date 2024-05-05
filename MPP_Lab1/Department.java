package MPP_Lab1;

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
    public double getTotalSalary(){
        double sum = 0;
        for(Person p: personLists){
            sum = sum + p.getSalary();
        }
        return sum;
    }
    public void showAllMembers(){
        for(Person p: personLists){
            System.out.println(p);
        }
    }
    public void unitsPerFaculty(){
        for(Person p: personLists){
            if(p instanceof Faculty){
                Faculty f = (Faculty) p;
                System.out.println(f.getName() + " Total Number of Units: " + f.getTotalUnits());
            }
        }
    }

    public void StudentsNamesByFaculty(String facultyName){
        List<Person> lists = new ArrayList<>();
        for(Person p: personLists){
            if(p instanceof Faculty && p.getName().equals(facultyName)){
                Faculty f = (Faculty) p;
                List<Course> facultyCourses = f.getCourses();
                for(Person s: personLists){
                    if(s instanceof Student ){
                        for(Course studentCourse: ((Student) s).getCourses()){
                            if(facultyCourses.contains(studentCourse)){
                                if(!lists.contains(s)){
                                    lists.add(s);
                                }
                            }
                        }
                    }
                }
            }
        }
        for(Person p: lists){
            System.out.println(p.getName());
        }
    }
}
