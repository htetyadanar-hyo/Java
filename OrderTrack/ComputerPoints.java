package OrderTrack;

public class ComputerPoints extends ACompPoints{
    private double points;

    public ComputerPoints(double points){
        this.points = points;
    }

    @Override
    public double getPoints() {
        return points;
    }
}
