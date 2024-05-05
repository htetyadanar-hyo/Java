package FPP_Assignment8;

import java.util.*;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    Marketing(String employeeName,String productName,double salesAmount){
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return "Marketing{" +
                "employeeName='" + employeeName + '\'' +
                ", productName='" + productName + '\'' +
                ", salesAmount=" + salesAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marketing marketing = (Marketing) o;
        return salesAmount == marketing.salesAmount && Objects.equals(employeeName, marketing.employeeName) && Objects.equals(productName, marketing.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, productName, salesAmount);
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        List<Marketing> result = new ArrayList<>();
        for(Marketing l:list){
            if(l.getSalesAmount()>1000){
                result.add(l);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Marketing> mylists = new ArrayList<>();
        mylists.add(new Marketing("Bob","Iphone",200));
        mylists.add(new Marketing("Alice","TV",500));
        mylists.add(new Marketing("Christ","Games",2000));
        mylists.add(new Marketing("Dean","Computer",20000));

        mylists.remove(0);
        System.out.println(mylists.size());
        Collections.sort(mylists, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return (int) (m1.getSalesAmount()-m2.getSalesAmount());
            }
        });
        System.out.println(mylists);
        List<Marketing> newList = listMoreThan1000(mylists);
        Collections.sort(newList, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return m1.getEmployeeName().compareTo(m2.getEmployeeName());
            }
        });
        System.out.println(newList);
    }
}