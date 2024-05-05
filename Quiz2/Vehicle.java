package InnerClasses.Quiz2;

public class Vehicle {
    String name;
    Vehicle(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void print(){
        System.out.println("Vehicle");
    }
}
