package MPP_Lab5;

final class Paycheck {
    private final double grossPay;
    private final double FICA;
    private final double STATE;
    private final double LOCAL;
    private final double MEDICARE;
    private final double SOCIALSECURITY;
    private String payPeriod;
    private Employee e;

    public Paycheck(double grossPay, double FICA,double STATE,double LOCAL,double MEDICARE,double SOCIALSECURITY,String payPeriod,Employee e){
        this.grossPay = grossPay;
        this.FICA = FICA;
        this.STATE = STATE;
        this.LOCAL = LOCAL;
        this.MEDICARE = MEDICARE;
        this.SOCIALSECURITY = SOCIALSECURITY;
        this.payPeriod = payPeriod;
        this.e = e;
        this.e.addPaycheck(this);
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFICA() {
        return FICA;
    }

    public double getSTATE() {
        return STATE;
    }

    public double getLOCAL() {
        return LOCAL;
    }

    public double getMEDICARE() {
        return MEDICARE;
    }

    public double getSOCIALSECURITY() {
        return SOCIALSECURITY;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public Employee getE() {
        return e;
    }

    public void print(){
        System.out.println("Employee ID :" + e.getEmpId() + "/n" +  ",Fica :" + getFICA() + ",State :" + getSTATE() +
                ",Local :" + getLOCAL() + ",Medicare :" + getMEDICARE() + ",SocialSecurity :" + getSOCIALSECURITY() + ",GrossPay :" + e.calcGrossPay(payPeriod) + ",NetPay: " + getNetPay() );
    }

    public double getNetPay(){
        double tax = getFICA() + getSTATE() + getLOCAL() + getMEDICARE() + getSOCIALSECURITY();
        double payTax = tax * grossPay;
        return grossPay - payTax;
    }
}
