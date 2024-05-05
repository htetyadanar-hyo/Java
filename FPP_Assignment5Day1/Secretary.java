package FPP_Assignment5Day1;

class Secretary extends DeptEmployee {

    private double overtimeHours;
    public Secretary(String name,double salary,int year,int month,int day){
        super(name,salary,year,month,day);
    }

    public void setOvertimeHours(double overtimeHours){
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours(){
        return overtimeHours;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + (12 * overtimeHours);
    }
}
