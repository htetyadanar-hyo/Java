package Thread.PrimeChecker_Prob4;

public class Main {
    public static void main(String[] args) {
        PrimeChecker thread1 = new PrimeChecker(1,200000);
        PrimeChecker thread2 = new PrimeChecker(200001,400000);
        PrimeChecker thread3 = new PrimeChecker(400001,600000);
        PrimeChecker thread4 = new PrimeChecker(600001,800000);
        PrimeChecker thread5 = new PrimeChecker(800001,1000000);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
