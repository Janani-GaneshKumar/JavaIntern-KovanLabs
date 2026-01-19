package threadcreation;
import java.lang.*;
import java.io.*;
public class Exception_In_Runnable implements Runnable {
public static void main(String args[]) {
	Runnable r = new Exception_In_Runnable();
	Thread t = new Thread(r);
	t.start();
}
@Override
public void run() {
	try {
		throw new FileNotFoundException("File not found!");
		
	}
	catch(FileNotFoundException e) {
		System.out.println("Caught checked exception");
	}
	
	int a=10/0;//Arithmetic Exception . we can also catch the exception if not,It will be handled by JVM by printing stack trace
	//stack trace means sequence of method calls which led to exception.
}
}
