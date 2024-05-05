package MPP_Lab3;

import java.util.HashMap;

public class FedEx implements ICarrier {

    HashMap<String,Double> zonesPrice = new HashMap<>();
    double zonePriceForOther;

    public FedEx(){
        zonesPrice.put("IA",0.35);
        zonesPrice.put("MT",0.35);
        zonesPrice.put("OR",0.35);
        zonesPrice.put("CA",0.35);
        zonesPrice.put("TX",0.30);
        zonesPrice.put("UT",0.30);
        zonesPrice.put("FL",0.55);
        zonesPrice.put("MA",0.55);
        zonesPrice.put("OH",0.55);
        zonePriceForOther = 0.43;
    }
    @Override
    public double calculateCost(String zone, double weight) {
        double zoneCost;
        String packageZone = zone;
        if(zonesPrice.containsKey(packageZone)){
            zoneCost = zonesPrice.get(packageZone) * weight;
        }
        else{
            zoneCost = zonePriceForOther * weight;
        }
        return zoneCost;
    }
}
