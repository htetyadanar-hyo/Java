package FPP_Assignment5Day1;

import java.util.Scanner;

public class MainDept {

    public static void main(String[] args) {
        Professor p1 = new Professor("Jame",80000,1999,12,1);
        Professor p2 = new Professor("Taylor",90000,1980,12,23);
        Professor p3 = new Professor("Erik",69000,1982,3,23);

        Secretary s1 = new Secretary("Mark",20000,2000,5,2);
        Secretary s2 = new Secretary("John",25000,1999,11,1);
        s1.setOvertimeHours(2);
        s2.setOvertimeHours(1);
        DeptEmployee[] department = new DeptEmployee[5];
       // department[0] = p1;
        department[0] = new DeptEmployee("Jame",80000,1999,12,1);
        department[1] = p2;
        department[2] = p3;
        department[3] = s1;
        department[4] = s2;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to see the sum of salary of all Professor and Secretary?");
        System.out.println("Y/N");
        String ans = input.nextLine();//20024
        if(ans.equals("Y")){
            double sum = 0;
            for(DeptEmployee d: department){
                sum = sum + d.computeSalary();
            }
            System.out.println("The sum of all salaries: " + sum);
        }
    }
}
