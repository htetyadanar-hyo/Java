package library_system;

import java.util.List;

public class Book extends Aitem{
    private String ISBN;
    private List<String> authorList;
    private int limit;

    public Book(String title,String ISBN,int limit){
        super(title);
        this.ISBN = ISBN;
        this.limit = limit;
    }

    public void addAuthor(String a){
        authorList.add(a);
    }

    public List<String> getAuthorList(){
        return  authorList;
    }
    @Override
    public boolean checkAvailability() {
        if(getOnHandQty() >=1 ){
            return true;
        }
        return false;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setonHandQty(int n){
        super.setonHandQty(n);
    }

    public int getOnHandQty(){
        return super.getOnHandQty();
    }
}
