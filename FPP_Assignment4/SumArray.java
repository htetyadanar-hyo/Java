package FPP_Assignment4;

public class SumArray {

    public static void main(String[] args) {
        int[] n = {1,2,3};
        System.out.println(sum(n));
    }

    static int sum(int[] a){
        if(a.length ==0){
            return 0;
        }
        else if(a.length == 1){
            return a[0];
        }
        int[] newArray = new int[a.length-1];
        System.arraycopy(a,1,newArray,0,a.length-1);
        return a[0]+sum(newArray);
    }
}
