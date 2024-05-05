package Assignment2;

public class RemoveDups {

    public static void main(String[] args) {
        String[] myArr = {"horse", "dog", "dog", "horse", "cat"};
        String[] result = remove(myArr);
        for(String i: result){
            System.out.println(i);
        }
    }

    static String[] remove(String[] a){
        int count = 0;
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i].equals(a[j])){
                    a[j] = "";
                }
                else if(a[i] == ""){
                    continue;
                }
            }
        }

        for(int i=0;i<a.length; i++){
            if(a[i] != ""){
                count++;
            }
        }

        String[] result = new String[count];
        int j = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] != ""){
                result[j] = a[i];
                j++;
            }
        }
        return result;
     }
}
