package arraylist;
import java.util.*;
public class Arraylist {
public static void main(String args[]) {
	Student ob1 = new Student(1,"Janani",20);
	Student ob2 = new Student(2,"Kavya",19);
	ArrayList<Student> list = new ArrayList<Student>();
	list.add(ob1);
	list.add(ob2);
	Iterator it = list.iterator();
	while(it.hasNext()) {
		Student st=(Student)it.next();
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
}
}
