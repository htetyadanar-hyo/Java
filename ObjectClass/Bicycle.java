package ObjectClass;

import java.util.Objects;

public class Bicycle {
    int gear;
    int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return gear == bicycle.gear && speed == bicycle.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gear, speed);
    }
}
class MountainBicycle extends Bicycle{
    public int seatHeight;

    public MountainBicycle(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return "MountainBicycle{" +
                "seatHeight=" + seatHeight +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        Bicycle[] bikes = {new Bicycle(1, 20), new MountainBicycle(4, 30, 25)};
        for(Object bike: bikes){
            System.out.println(bike);
        }
    }
}