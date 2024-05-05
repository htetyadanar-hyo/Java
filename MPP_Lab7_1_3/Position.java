package MPP_Lab7_1_3;

public class Position implements Cloneable{
    private String title;
    private String description;

    private Employee employee;

    private Department department;
    public Position(String title, String description, Department department){
        this.title = title;
        this.description = description;
        this.department = department;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addEmployee(Employee e){
        this.employee = e;
    }

    @Override
    public String toString(){
        return "Type: Position, Title: " + title + ", Description: " + description ;
    }

    public void print(){
        if(employee !=null){
            employee.print();
        }
        else{
            System.out.println("No Employee for this position!");
        }
    }

    public double getSalary(){
        if(employee == null){
            return 0.0;
        }
        return employee.getSalary();
    }

    @Override
    public boolean equals(Object pos){
        if(this == pos) return true;
        if(pos == null) return false;
        if(this.getClass() != pos.getClass()) return false;
        Position position = (Position) pos;
        return this.title.equals(position.title);
    }

    @Override
    public int hashCode(){
        return title.hashCode();
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Position copy = (Position) super.clone();
        copy.department = (Department) department.clone();
        return copy;
    }
}
