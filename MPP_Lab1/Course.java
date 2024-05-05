package MPP_Lab1;

public class Course{
    private String number;
    private String title;
    private int units;
    private Person facultyName;

    public Course(String number, String title, int units,Person facultyName){
        this.number = number;
        this.title = title;
        this.units = units;
        this.facultyName = facultyName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

}