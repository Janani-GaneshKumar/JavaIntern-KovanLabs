package streams;

public class Boxing_OutBoxing {
public static void main(String args[]) {
	int a=10;
	Integer x=a;//Integer x=Integer.valueOf(a);//boxing converts primitive type into Wrapper class object.
	
	Integer b=20;
	int c=b;//Outboxing (int c=b.intValue(b))
	
}
}
