package threadcreation;
import java.util.*;
public class ComparableExample {
public static  void main(String args[]) {
	List<Student> list = new ArrayList<>();
	list.add(new Student("Janani",90));
	list.add(new Student("Kavya",100) );
	Collections.sort(list);//compareTo() is implicitly called  here by comparing two objects in a list
	for(Student i: list) {
		System.out.println(i);
	}
	
}
}
