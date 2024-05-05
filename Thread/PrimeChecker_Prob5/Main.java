package Thread.PrimeChecker_Prob5;


public class Main {
    public static void main(String[] args) {
        PrimeChecker thread1 = new PrimeChecker(1,100000);
        PrimeChecker thread2 = new PrimeChecker(100001,200000);
        PrimeChecker thread3 = new PrimeChecker(200001,300000);
        PrimeChecker thread4 = new PrimeChecker(300001,400000);
        PrimeChecker thread5 = new PrimeChecker(400001,500000);
        PrimeChecker thread6 = new PrimeChecker(500001,600000);
        PrimeChecker thread7 = new PrimeChecker(600001,700000);
        PrimeChecker thread8 = new PrimeChecker(700001,800000);
        PrimeChecker thread9 = new PrimeChecker(800001,900000);
        PrimeChecker thread10 = new PrimeChecker(900001,1000000);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
