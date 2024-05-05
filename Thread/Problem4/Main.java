package Thread.Problem4;

public class Main {
    public static void main(String[] args) {
        PrimeThread thread1 =new PrimeThread(1,200000);
        PrimeThread thread2 =new PrimeThread(200001,400000);
        PrimeThread thread3 =new PrimeThread(400001,600000);
        PrimeThread thread4 =new PrimeThread(600001,800000);
        PrimeThread thread5 =new PrimeThread(800001,1000000);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
}

