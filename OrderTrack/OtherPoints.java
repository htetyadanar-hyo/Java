package OrderTrack;

public class OtherPoints extends ACompPoints{
    private double points;

    public OtherPoints(double points){
        this.points = points;
    }

    @Override
    public double getPoints() {
        return points;
    }
}
