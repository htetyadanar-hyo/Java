package library_system;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<IMember> imembers;
    private List<IItem> items;

    public Library(){
        imembers = new ArrayList<>();
        items = new ArrayList<>();
    }

    public void addImembers(IMember im){
        imembers.add(im);
    }

    public void addIItems(IItem it){
        items.add(it);
    }

    public List<IItem> getItems() {
        return items;
    }

    public List<IMember> getImembers(){
        return imembers;
    }
}
