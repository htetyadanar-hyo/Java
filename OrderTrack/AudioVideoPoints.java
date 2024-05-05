package OrderTrack;

public class AudioVideoPoints extends ACompPoints{
    private double points;

    public AudioVideoPoints(double points){
        this.points = points;
    }
    @Override
    public double getPoints() {
        return points;
    }
}
