package library_system;

import java.util.Date;

public class Reservation{
    private IItem i;
    private Date reservation_Date;

    public Reservation(IItem i, Date reservation_Date){
        this.i = i;
        this.reservation_Date = reservation_Date;
    }

    public IItem getI() {
        return i;
    }

    public Date getReservation_Date() {
        return reservation_Date;
    }

    public boolean checkAvailability(){
        if(i instanceof Aitem){
            if(((Aitem) i).getOnHandQty() >= 1){
                return true;
            }
        }
        return false;
    }

}
