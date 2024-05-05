package OrderTrack;

public class HealthPoints extends ACompPoints{
    private double points;

    public HealthPoints(double points){
        this.points = points;
    }

    @Override
    public double getPoints() {
        return points;
    }
}
