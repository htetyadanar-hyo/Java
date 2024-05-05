package MPP_Lab8.Level3_5;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
    private double salary;
    private List<Course> courses;

    public Faculty(String name, String phone, int age, double salary){
        super(name,phone,age);
        this.salary = salary;
        courses = new ArrayList<>();
    }

    @Override
    public void addCourses(Course course){
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

//    @Override
//    public int getTotalUnits(){
//        int total = 0;
//        for(Course course: courses) {
//            total = total + course.getUnits();
//        }
//        return total;
//    }

    public int getTotalUnits(){
        return courses.stream()
                .mapToInt(Course::getUnits)
                .sum();
    }


    @Override
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Phone: " + getPhone() + ", age: " + getAge() + "Type: Faculty";
    }
}

