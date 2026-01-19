package threadcreation;

public class Student1 {
	int rollnumber;
	String name;
	int marks;

public Student1(int rollnumber, String name, int marks) {
	this.rollnumber=rollnumber;
	this.name=name;
	this.marks=marks;
}
@Override
public String toString() {
	return rollnumber+" : "+name+" : "+marks;
}
}
