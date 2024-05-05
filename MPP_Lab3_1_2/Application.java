package MPP_Lab3_1_2;

public class Application {
    public static void main(String[] args) {
        //Creating Company
        Company c = new Company("MyCompany");

        //Creating Deparment
        Department itDept = new Department("IT", "HH",c);
        Department hrDept = new Department("Human Resources","H3",c);
        //Adding Deparment to Company
        c.addDepartments(itDept);
        c.addDepartments(hrDept);

        //Creation Position
        Position frontEnd = new Position("Developer","FrontEnd",itDept);
        Position analyst = new Position("Analyst","ERP",itDept);
        Position backEnd = new Position("Developer","BackEnd",itDept);
        Position hrJunior = new Position("Recruiter Junior","Recruiter Junior",hrDept);
        Position hrSenior = new Position("Recruiter Senior","Recruiter Senior",hrDept);
        Position hrManager = new Position("HR Manager","Recruiter Manager",hrDept);
        //Adding Department to position
        itDept.addPosition(frontEnd);
        itDept.addPosition(analyst);
        itDept.addPosition(backEnd);
        hrDept.addPosition(hrJunior);
        hrDept.addPosition(hrSenior);
        hrDept.addPosition(hrManager);

        Employee htet = new Employee(1,"Htet","Yadanar","Oo",1999,11,2,"12345",10000,analyst);
        Employee jone = new Employee(2,"Jone","Jack","Hen",1989,1,21,"123456",9000,backEnd);
        Employee su = new Employee(3,"Su","Yee","Mon",2000,1,1,"1234567",6000,hrJunior);
        Employee myat = new Employee(4,"Myat","Min","Kyaw",1989,1,22,"12345678",10000,hrManager);
        analyst.addEmployee(htet);
        backEnd.addEmployee(jone);
        hrManager.addEmployee(myat);
        hrJunior.addEmployee(su);

        c.print();
        c.getSalary();

    }
}
