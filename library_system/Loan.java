package library_system;

import java.util.Date;

public class Loan {
    private IItemCopy i;
    private Member m;
    private Date check_out_date;
    private Date return_date;

    public Loan(Member m,IItemCopy i,Date check_out_date,Date return_date){
        this.i = i;
        this.check_out_date = check_out_date;
        this.return_date = return_date;
        this.m = m;
    }

    public Member getM() {
        return m;
    }

    public void setM(Member m) {
        this.m = m;
    }

    public IItemCopy getI() {
        return i;
    }

    public void setI(IItemCopy i) {
        this.i = i;
    }

    public Date getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(Date check_out_date) {
        this.check_out_date = check_out_date;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }
}
