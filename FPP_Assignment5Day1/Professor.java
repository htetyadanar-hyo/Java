package FPP_Assignment5Day1;

class Professor extends DeptEmployee {

    private int numberOfPublications;
    public Professor(String name, double salary, int year,int month,int day){
        super(name,salary,year,month,day);
    }

    public void setNumberOfPublications(int numberOfPublications){
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications(){
        return numberOfPublications;
    }
}
