package MPP_Lab3;

public class PackageClass {

    private String description;
    private String zone;
    private double weight;
    private Person person;
    public PackageClass(String description,String zone,double weight,Person person){
        this.description = description;
        this.zone = zone;
        this.weight = weight;
        this.person = person;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String calculateLowest(){
        double lowest = Double.MAX_VALUE;
        String lowestMethod = "";

        double costUPS = new UPS().calculateCost(zone,weight);
        double costUSMail = new USMail().calculateCost(zone,weight);
        double costFedEx = new FedEx().calculateCost(zone,weight);
        if (costFedEx < lowest) {
            lowest = costFedEx;
            lowestMethod = "Fedex";
        }
        if (costUPS < lowest) {
            lowest = costUPS;
            lowestMethod = "UPS";
        }
        if (costUSMail < lowest) {
            lowest = costUSMail;
            lowestMethod = "USMail";
        }
        return String.format("%-7s $%.2f %s", description, lowest, lowestMethod);
    }

    public String calculateLowestByPerson(){
        double lowest = Double.MAX_VALUE;
        String lowestMethod = "";

        double costUPS = new UPS().calculateCost(zone,weight);
        double costUSMail = new USMail().calculateCost(zone,weight);
        double costFedEx = new FedEx().calculateCost(zone,weight);
        if (costFedEx < lowest) {
            lowest = costFedEx;
            lowestMethod = "Fedex";
        }
        if (costUPS < lowest) {
            lowest = costUPS;
            lowestMethod = "UPS";
        }
        if (costUSMail < lowest) {
            lowest = costUSMail;
            lowestMethod = "USMail";
        }

        if(person.getType().equals("Student")){
            lowest = (10 * lowest) / 100;
        }
        else if(person.getAge() >= 65 || person.getType().equals("Senior")){
            lowest = (15 * lowest) / 100;
        }

        return String.format("%-7s $%.2f %s", description, lowest, lowestMethod);
    }
}
