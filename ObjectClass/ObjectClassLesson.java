package ObjectClass;

import java.util.Objects;

public class ObjectClassLesson {

    int id;
    String name;

    ObjectClassLesson(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if(obj == null || getClass() !=obj.getClass()) {
            return false;
        }
        ObjectClassLesson objclass = (ObjectClassLesson) obj;
        return id == objclass.id && Objects.equals(name,objclass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }


    public static void main(String[] args) {
        ObjectClassLesson tsl1 = new ObjectClassLesson(1,"Htet");
        ObjectClassLesson tsl2 = new ObjectClassLesson(1,"Htet");
        System.out.println(tsl1.equals(tsl2));
        System.out.println(tsl1.hashCode());
        System.out.println(tsl2.hashCode());

    }
}

