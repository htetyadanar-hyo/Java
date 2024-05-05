package MPP_Lab3;

public class UPS implements ICarrier {

    @Override
    public double calculateCost(String zone, double weight) {
        return 0.45 * weight;
    }
}
