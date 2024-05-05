package MPP_Lab7_4_interface;

public class Person implements IPerson{
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

    @Override
    public void myAbstract(){
        System.out.println("From My Abstract Method");
    }
}
