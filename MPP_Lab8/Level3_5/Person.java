package MPP_Lab8.Level3_5;

public class Person{
    private String name;
    private String phone;
    private int age;

    public Person(String name,String phone,int age){
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public void addCourses(Course course){
        return;
    }

    public double getSalary(){
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTotalUnits(){return 0;}
}
