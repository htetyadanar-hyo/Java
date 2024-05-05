package Thread.Problem4;

public class PrimeThread extends Thread {
    private int start;
    private int end;
    public PrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    boolean isPrime(int anInt){
        if(anInt<2)
            return false;
        if(anInt==2)
            return true;
        for(int i=2;i<anInt;i++) {
            if (anInt % 2 == 0) return false;
        }
        return true;
    }
}
