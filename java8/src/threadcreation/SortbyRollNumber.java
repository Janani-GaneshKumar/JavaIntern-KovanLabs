package threadcreation;
import java.lang.*;
import java.util.Comparator;
public class SortbyRollNumber implements Comparator<Student1>{
	public int compare(Student1 A,Student1 B) {
		return A.rollnumber-B.rollnumber;
	}

}
