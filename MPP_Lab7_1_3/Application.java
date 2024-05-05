package MPP_Lab7_1_3;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Creating Company
        Company c = new Company("MyCompany");

        //Creating Deparment
        Department itDept = new Department("IT", "HH",c);
        Department hrDept = new Department("Human Resources","H3",c);
        Department itDeptTwo = new Department("IT", "HH",c);
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
        Position hrManagerTwo = new Position("HR Manager","Recruiter Manager",hrDept);
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
        Employee htetTwo = new Employee(1,"Htet","Yadanar","Oo",1999,11,2,"12345",10000,analyst);
        analyst.addEmployee(htet);
        backEnd.addEmployee(jone);
        hrManager.addEmployee(myat);
        hrJunior.addEmployee(su);

//        c.print();
//        c.getSalary();

        //Testing Lab7.No1
        System.out.println("Employee Object Equal Testing:" + htet.equals(htetTwo));
        System.out.println("Employee Object Equal Testing" + htet.equals(jone));


        //Testing Lab7.No2
        System.out.println("Position Object Equal Testing:" + hrManager.equals(hrManagerTwo));
        System.out.println("Position Object Equal Testing" + hrManager.equals(hrJunior));

        //Testing Lab7.No3
        System.out.println("Department Object Equal Testing:" + itDept.equals(itDeptTwo));
        System.out.println("Department Object Equal Testing:" + itDept.equals(hrDept));

        //Testing Lab7.No4
        System.out.println(htet);

        //Testing Lab7.No5
        System.out.println(hrDept);

        //Testing Lab7.No6
        System.out.println(itDept);

        //Testing Lab7.No7
        System.out.println("Employee HashCode Testing");
        System.out.println(htet.hashCode());
        System.out.println(htetTwo.hashCode());

        //Testing Lab7.No8
        System.out.println("Position HashCode Testing");
        System.out.println(hrManager.hashCode());
        System.out.println(hrManagerTwo.hashCode());

        //Testing Lab7.No.12
        System.out.println("Position Clone Testing");
        Position hrJuniorTwo = (Position) hrJunior.clone();
        System.out.println(hrJuniorTwo.equals(hrJunior));

        //Tesing Lab7.No.13
        System.out.println("Employee Clone Testing");
        Employee joneTwo = (Employee) jone.clone();
        System.out.println(joneTwo.equals(jone));


    }
}
