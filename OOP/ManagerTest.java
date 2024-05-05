package OOP;

class ManagerTest {
    public static void main(String[] args) {
         Manager boss = new Manager("Benny",80000,1987,12,15);
         boss.setBonus(5000);
         Employee[] staff = new Employee[3];
         staff[0] = boss;
         staff[1] = new Employee("Jimmy",50000,1989,10,1);
         staff[2] = new Employee("Tommy",40000,1990,3,15);

         //print names and salaries
        for(Employee e: staff){
            System.out.println("name: " + e.getName() + " salary: " + e.getSalary());
        }
    }
}
