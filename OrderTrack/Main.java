package OrderTrack;

import java.util.List;

public class Main {
    List<ICustomer> icustomerList;
    public void addICustomer(ACustomer a){
        icustomerList.add(a);
    }

    public void customerSmallestPoints(){
        for(ICustomer i: icustomerList){
            double smallest = Double.MAX_VALUE;
            ACustomer a = (ACustomer) i;
        }
    }
    public static void main(String[] args) {

    }

}
