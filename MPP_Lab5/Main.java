package MPP_Lab5;

public class Main {
    public static void main(String[] args) {
        Employee hourlyE = new Hourly(1,10,20);
        Employee salaryE = new Salaried(2,5000);
        Employee commissionE = new Commissioned(3,0.07,6000);

        Order one = new Order(1001,2024,3,2,2000,commissionE);
        Order two = new Order(1002,2024,3,3,2000,commissionE);
        Order three = new Order(1003,2024,3,4,2000,commissionE);

        Order four = new Order(1003,2024,4,4,2000,commissionE);
        commissionE.calcCompensation(3,2024);
        commissionE.calcCompensation(4,2024);
        commissionE.print();
        salaryE.calcCompensation(3,2024);
        salaryE.print();
        hourlyE.calcCompensation(3,2024);
        hourlyE.print();
    }
}
