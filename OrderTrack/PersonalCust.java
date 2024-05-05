package OrderTrack;

public class PersonalCust extends ACustomer{
    private String creditRating;
    private String creditCard;

    public PersonalCust(String name,String address,String phone,double points, String creditCard){
        super(name, address, phone, points);
        this.creditCard = creditCard;
        this.creditRating = "Poor";
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCreditRating(){
        return creditRating;
    }
}
