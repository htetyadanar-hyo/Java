package Thread.PrimeChecker_Prob6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeChecker extends Thread{
    private int start;
    private int end;
    private List<Integer> primes;
    public PrimeChecker(int start,int end){
        this.start = start;
        this.end = end;
        this.primes = new ArrayList<>();
    }
    public void run(){
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
    }
    public List<Integer> getPrimes(){
        return primes;
    }
    public void printSortedPrime(List<Integer> primes){
        Collections.sort(primes);
        for(Integer i: primes){
            System.out.print(i + " ");
        }
    }
    public boolean isPrime(int anInt){
        if(anInt <= 1){
            return false;
        }
        if(anInt == 2){
            return true;
        }
        for(int i=2; i<anInt; i++){
            if(anInt % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
