package MPP_Lab1;

public class Staff extends Person{
    private double salary;

    public Staff(String name, String phone, int age, double salary){
        super(name,phone,age);
        this.salary = salary;
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
        return "Name: " + getName() + ", Phone: " + getPhone() + ", age: " + getAge() + "Type: Staff";
    }
}

