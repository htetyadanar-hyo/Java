package library_system;

public class Magazine extends Aitem{
    private int limit;
    private int issue;
    public Magazine(String title,int limit,int issue){
        super(title);
        this.limit = limit;
        this.issue = issue;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public void setonHandQty(int n){
        super.setonHandQty(n);
    }

    public int getOnHandQty(){
        return super.getOnHandQty();
    }

    @Override
    public boolean checkAvailability() {
        if(getOnHandQty() >=1 ){
            return true;
        }
        return false;
    }
}
