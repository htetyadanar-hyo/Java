package MPP_Lab3;

public class USMail implements ICarrier {

    @Override
    public double calculateCost(String zone,double weight) {
        if(weight <= 3.0){
            return 1.00 * weight;
        }
        else{
            return 0.55 * weight;
        }
    }
}
