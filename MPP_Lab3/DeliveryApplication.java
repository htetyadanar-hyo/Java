package MPP_Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeliveryApplication {
    public static void main(String[] args) {
        List<String> myresult = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of packages");
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Please enter package description");
            String des = input.next();
            System.out.println("Please enter package weight");
            double weight = input.nextDouble();
            System.out.println("Please enter package zone");
            String zone = input.next();
            System.out.println("Please enter person type");
            String type = input.next();
            System.out.println("Please enter age");
            int age = input.nextInt();
            Person p = new Person(type,age);
            PackageClass mypackage = new PackageClass(des,zone,weight,p);
            myresult.add(mypackage.calculateLowestByPerson());
        }

        for(String res: myresult){
            System.out.println(res);
        }
    }
}
