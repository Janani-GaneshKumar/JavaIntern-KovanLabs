package threadcreation;

public class Student implements Comparable<Student>{
String name;
int marks;

public Student(String name,int marks) {
	this.name=name;
	this.marks=marks;
}

@Override
public int compareTo(Student others) {
	return this.marks-others.marks;//ascending order.
}
@Override
 public String toString() {
	return name+" : "+marks;	 
 }

}
