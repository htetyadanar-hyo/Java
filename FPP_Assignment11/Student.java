package FPP_Assignment11;

import java.util.Objects;

public class Student {
	private String firstName;
	private String lastName;
	private double gpa;
	private Standing standing;
	public Student(String firstName, String lastName, double gpa, Standing standing) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa=gpa;
		this.standing = standing;
	}
	public Standing getStanding() {
		return standing;
	}
	public double getGpa() {
		return gpa;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@Override
	public String toString() {
		return "[" + firstName + " " + lastName + "]";
	}
	
	@Override
	public boolean equals(Object ob) {
		//if(this == ob) return true;
		if(ob == null) return false;
		//if(ob.getClass() != getClass()) return false;
		if(ob.getClass() != Student.class) return false;
//		if (this == ob) return true;
//		if (ob == null || getClass() != ob.getClass()) return false;
		Student s = (Student)ob;
//		return Double.compare(s.gpa, gpa) == 0 && Objects.equals(firstName, s.firstName) && Objects.equals(lastName, s.lastName);
		return s.firstName.equals(firstName) && s.lastName.equals(lastName);
	}

	@Override
	public int hashCode(){
		return Objects.hash(firstName,lastName);
	}
}
