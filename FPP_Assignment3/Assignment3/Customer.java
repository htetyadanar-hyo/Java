package Assignment3;

public class Customer {
    String firstName;
    String lastName;
    String socSecurityNum;
    Address billingAddress;
    Address shippingAddress;

    Customer(String firstName,String lastName,String socSecurityNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    void setSocSecurityNum(String socSecurityNum){
        this.socSecurityNum = socSecurityNum;
    }

    void setBillingAddress(Address billingAddress){
        this.billingAddress = billingAddress;
    }

    void setShippingAddress(Address shippingAddress){
        this.shippingAddress = shippingAddress;
    }

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;
    }

    String getSocSecurityNum(){
        return socSecurityNum;
    }

    Address getBillingAddress(){
        return billingAddress;
    }

    Address getShippingAddress(){
        return shippingAddress;
    }



}
class Address {

    String street;
    String city;

    String state;
    String zip;

    Address(String street,String city,String state,String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    String getCity(){
        return city;
    }
}

class MainOne{
    public static void main(String[] args) {
        Customer[] myCustomers = new Customer[3];
        Customer c1 = new Customer("Jame","Jone","12345");
        c1.setBillingAddress(new Address("1000","Chicago","Chicago","1111"));
        c1.setShippingAddress(new Address("2000","Iowa","Iowa","1102"));

        Customer c2 = new Customer("Lily","Jim","12780");
        c2.setBillingAddress(new Address("2122","FairField","Iowa","52557"));
        c2.setShippingAddress(new Address("3000","Mount Pleasant","Iowa","52553"));

        Customer c3 = new Customer("Nick","Min","12999");
        c3.setBillingAddress(new Address("2123","Chicago","Chicago","1292"));
        c3.setShippingAddress(new Address("2123","New York","New York","1292"));

        myCustomers[0] = c1;
        myCustomers[1] = c2;
        myCustomers[2] = c3;

        for(int i=0; i< myCustomers.length; i++){
            if(myCustomers[i].billingAddress.getCity().equals("Chicago")){
                System.out.println(myCustomers[i]);
            }
        }

    }
}