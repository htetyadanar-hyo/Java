package OOP;

//if there is one (no argument constructor) in superclass, subclass no need to call super
//If I put private on this no arguemnt contructorr in superclass, we have to call that super on subclas
public class EmployeeTestSuper {
    String name;
    double salary;
    int y;
    int m;
    int d;
    EmployeeTestSuper(String name, double salary, int y,int m, int d){
        this.name = name;
        this.salary = salary;
        this.m = m;
        this.y = y;
        this.d = d;
    }

    EmployeeTestSuper(){

    }
}

class ManagerTestTwo extends EmployeeTestSuper{

    /*ManagerTestTwo(String name, double salary, int y,int m, int d){
        super(name,salary,y,m,d);
    }*/
}
