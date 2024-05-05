package library_system;

public abstract class Aitem implements IItem{
    private String title;

    private int onHandQty;

    public Aitem(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setonHandQty(int n){
        this.onHandQty = n;
    }

    public int getOnHandQty(){
        return onHandQty;
    }
    public abstract boolean checkAvailability();
}
