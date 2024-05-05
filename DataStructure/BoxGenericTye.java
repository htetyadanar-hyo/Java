package DataStructure;
//a generic type in Java is a class, interface, or method that can operate on multiple data types
// through the use of type parameters,
// providing type safety and code reusability.
public class BoxGenericTye<T>{
    private T value;
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }

    public static <T> T getValueFromArray(T[] array, int index){
        return array[index];
    }

    public static void main(String[] args) {
        BoxGenericTye<Integer> myBox = new BoxGenericTye<>();
        myBox.setValue(10);
        System.out.println(myBox.getValue());

        BoxGenericTye<String> myBox2 = new BoxGenericTye<>();
        myBox2.setValue("Hello");
        System.out.println(myBox2.getValue());

        String[] array = {"A","B","C"};
        System.out.println(getValueFromArray(array, 1));
    }
}
