package library_system;

import java.util.ArrayList;
import java.util.List;

public class Member implements IMember{
    private String id;
    private String name;
    private String address;
    private String phone;

    private List<Loan> loans;

    private List<Reservation> reservations;

    public Member(String id, String name, String address,String phone){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        loans = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addLoan(Loan l){
        loans.add(l);
    }

    public void addReservation(Reservation r){
        reservations.add(r);
    }

    public void reserve(){
        for(Reservation r: reservations){
            if(r.getI() instanceof Aitem){
                System.out.println(((Aitem) r.getI()).getTitle());
            }
        }
    }

    public void borrow(){
        for(Loan l: loans){
            if(l.getI() instanceof ItemCopy){
                System.out.println(l.getCheck_out_date());
            }
        }
    }

    public void returnTrack(){
        for(Loan l: loans){
            if(l.getI() instanceof ItemCopy){
                System.out.println(l.getReturn_date() + ((ItemCopy) l.getI()).getCopyId());
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }


}
