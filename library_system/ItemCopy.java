package library_system;

public class ItemCopy implements IItemCopy{
    private String copyId;
    private boolean available;
    private Loan l;
    private IItem i;

    public ItemCopy(Loan l,IItem i,String copyId, boolean available){
        this.copyId = copyId;
        this.available = available;
        this.l = l;
        this.i = i;
    }
    public String getCopyId() {
        return copyId;
    }

    public void setCopyId(String copyId) {
        this.copyId = copyId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Loan getL() {
        return l;
    }

    public void setL(Loan l) {
        this.l = l;
    }

    public IItem getI() {
        return i;
    }

    public void setI(IItem i) {
        this.i = i;
    }
}
