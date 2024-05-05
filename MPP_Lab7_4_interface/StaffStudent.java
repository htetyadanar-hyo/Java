package MPP_Lab7_4_interface;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffStudent extends Staff {

    private double GPA;
    private Date firstCourseDate;

    private List<Course> courses;
    public StaffStudent(String name, String phone, int age, double salary){
        super(name, phone, age, salary);
        courses = new ArrayList<>();
    }

    @Override
    public void addCourses(Course course) {
        courses.add(course);
    }

    public double getGpa() {
        return GPA;
    }

    public void setGpa(double GPA) {
        this.GPA = GPA;
    }

    public Date getFirstCourseDate() {
        return firstCourseDate;
    }

    public void setFirstCourseDate(Date firstCourseDate) {
        this.firstCourseDate = firstCourseDate;
    }
}
