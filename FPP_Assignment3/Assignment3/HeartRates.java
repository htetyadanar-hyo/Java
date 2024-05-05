package Assignment3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HeartRates {

    String firstName;
    String lastName;
    LocalDate DOB;
    final int RHR = 70;
    final float LB = 0.5f;
    final float UB = 0.85f;

    HeartRates(String firstName,String lastName,LocalDate DOB){
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;
    }

    LocalDate getDOB(){
        return DOB;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    void setDOB(LocalDate DOB){
        this.DOB = DOB;
    }

    public int getAge(){
        AgeCalculator ageCalculator = new AgeCalculator();
        Period age = ageCalculator.calculateAge(this.DOB);
        return age.getYears();
    }

    int calculateHeartRate(){
        return 220 - this.getAge();
    }



    void targetHeartRate(){
        int AHR = this.calculateHeartRate() - RHR;
        double LBTHR = (double) (AHR*LB) + RHR;
        double UBTHR = (double) (AHR*UB) + RHR;
        System.out.println("The target heart rate is between " + LBTHR + " and " + UBTHR);
    }

    public String toString() {
        return "First Name :" + firstName + "\n " + "Last Name :" + lastName + "\n "+ "Age :" + this.getAge() + "\n "
                + "Date of Birth :" + DOB + "\n " + "Maximun Health Rate :" + this.calculateHeartRate() + "\n ";
    }

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your first name: ");
        String fn = input.nextLine();
        System.out.println("Please, enter your last name: ");
        String ln = input.nextLine();
        System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd)-Example 1989-4-14: ");
        String dob = input.nextLine();
        HeartRates patient = new HeartRates(fn,ln,LocalDate.parse(dob, formatter));
        System.out.println(patient.getFirstName());
        patient.targetHeartRate();
        System.out.println(patient);
        input.close();
    }
}
