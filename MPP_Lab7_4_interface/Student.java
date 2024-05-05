package MPP_Lab7_4_interface;

import java.util.ArrayList;

public class Student extends Person {
    private double GPA;
    private ArrayList<Course> courses;
    public Student(String name, String phone, int age, double GPA){
        super(name,phone,age);
        this.GPA = GPA;
        this.courses = new ArrayList<>();
    }

    @Override
    public void addCourses(Course course){
        courses.add(course);
    }

    public int getTotalUnits(){
        int total = 0;
        for(Course course: courses){
            total = total + course.getUnits();
        }
        return total;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Phone: " + getPhone() + ", age: " + getAge() + "Type: Student";
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}

