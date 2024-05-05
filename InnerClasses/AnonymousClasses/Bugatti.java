package InnerClasses.AnonymousClasses;

public class Bugatti implements Luxury {
    @Override
    public boolean isLuxury() {
        return false;
    }
    @Override
    public void printSpecialFeatures() {
        System.out.println("Buggati");
    }
}
