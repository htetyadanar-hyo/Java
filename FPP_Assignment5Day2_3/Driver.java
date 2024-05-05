package FPP_Assignment5Day2_3;

public class Driver {
    public static void main(String[] args) {
        Employee[] e = new Employee[5];
        CommissionEmployee ce1 = new CommissionEmployee("Jack","Reacher","12345",20,10);
        CommissionEmployee ce2 = new CommissionEmployee("Erik","Sine","23456",30,20);
        BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee("J","J","11111",40,50,5000);
        HourlyEmployee he = new HourlyEmployee("Eaint","Myat","22222",20,10);
        SalariedEmployee se = new SalariedEmployee("Su","Su","23232",6000);
        e[0] = ce1;
        e[1] = ce2;
        e[2] = bce;
        e[3] = he;
        e[4] = se;
        double sum = 0;
        for(Employee x: e){
            System.out.println(x);
            sum = sum + x.getPayment();
        }
        System.out.println("The total salaries of all Employee: " + sum);

    }
}
