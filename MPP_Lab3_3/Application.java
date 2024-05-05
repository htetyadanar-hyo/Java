package MPP_Lab3_3;

public class Application {
    public static void main(String[] args) {
        //Creating Company
        Company c = new Company("MyCompany");

        //Creating Deparment
        Department itDept = new Department("IT", "HH",c);
        Department hrDept = new Department("Human Resources","H3",c);
        Department headDept = new Department("Head","HI",c);
        //Adding Deparment to Company
        c.addDepartments(itDept);
        c.addDepartments(hrDept);
        c.addDepartments(headDept);

        //Creation Position
        Position ITHead = new Position("IT Head","IT Head",itDept);
        Position frontEnd = new Position("Developer","FrontEnd",itDept);
        Position analyst = new Position("Analyst","ERP",itDept);
        Position backEnd = new Position("Developer","BackEnd",itDept);
        Position hrJunior = new Position("Recruiter Junior","Recruiter Junior",hrDept);
        Position hrSenior = new Position("Recruiter Senior","Recruiter Senior",hrDept);
        Position hrManager = new Position("HR Manager","Recruiter Manager",hrDept);
        Position CEO = new Position("CEO","CEO",headDept);
        //Adding Department to position
        itDept.addPosition(frontEnd);
        itDept.addPosition(analyst);
        itDept.addPosition(backEnd);
        itDept.addPosition(ITHead);
        hrDept.addPosition(hrJunior);
        hrDept.addPosition(hrSenior);
        hrDept.addPosition(hrManager);
        headDept.addPosition(CEO);

        Employee htet = new Employee(1,"Htet","Yadanar","Oo",1999,11,2,"12345",10000,analyst);
        Employee jone = new Employee(2,"Jone","Jack","Hen",1989,1,21,"123456",9000,backEnd);
        Employee su = new Employee(3,"Su","Yee","Mon",2000,1,1,"1234567",6000,hrJunior);
        Employee myat = new Employee(4,"Myat","Min","Kyaw",1989,1,22,"12345678",10000,hrManager);
        analyst.addEmployee(htet);
        backEnd.addEmployee(jone);
        hrManager.addEmployee(myat);
        hrJunior.addEmployee(su);

        //c.print();
        c.getSalary();

        CEO.addInferior(hrManager);
        hrManager.addInferior(hrSenior);
        hrSenior.addInferior(hrJunior);
        CEO.addInferior(ITHead);
        ITHead.addInferior(frontEnd);
        ITHead.addInferior(backEnd);
        ITHead.addInferior(analyst);
       // hrManager.printDownLine();

        frontEnd.addSuperior(CEO);
        analyst.addSuperior(CEO);
        backEnd.addSuperior(CEO);
        hrSenior.addSuperior(hrManager);
        hrJunior.addSuperior(hrSenior);

        c.printReportingHierarchy();
        System.out.println("IT Department Head: " + itDept.getDepartmentHead().getTitle());
        System.out.println("HR Department Head: " + hrDept.getDepartmentHead().getTitle());
        System.out.println("Top Executive: " + c.getTopExecutive().getTitle());


        //System.out.println(headDept.getDepartmentHead().getDescription());
        //System.out.println(c.getTopExecutive().getTitle());

    }
}
