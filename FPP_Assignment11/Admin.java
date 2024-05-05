package FPP_Assignment11;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> hashMap = new HashMap<>();
		for(Student s: students){
			Key key = new Key(s.getFirstName(),s.getLastName());
			hashMap.put(key,s);
		}
		return hashMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		double totalGPA = 0.0;
		int numOfStudent = 0;
        for(Student student: maps.values()){
			totalGPA = totalGPA + student.getGpa();
			numOfStudent++;
		}
		double averageGPA = 0.0;
		if(numOfStudent > 0){
			averageGPA = totalGPA/numOfStudent;
		}
		else{
			return 0.0;
		}
		return averageGPA;
	}
}
