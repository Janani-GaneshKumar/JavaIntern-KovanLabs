package threadcreation;
import java.util.*;
import java.util.Collections;
import java.util.List;
	public class ComparatorExample {
		public static void main(String args[]) {
			List<Student1> list = new ArrayList<>();
			list.add(new Student1(111,"Janani",90));
			list.add(new Student1(100,"Kavya",100));
			Collections.sort(list,new SortbyRollNumber());
			for(Student1 i:list) {
				System.out.println(i);
			}
		}

	}


