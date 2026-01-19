package threadcreation;

public class MyThread extends Thread {
public static void main(String args[]) {
	MyThread t = new MyThread();//creating an object for the new thread
	t.start();// this start() method make JVM to Create a thread internally.
}
@Override
public void run() {
	System.out.println("Running Thread : "+Thread.currentThread().getName());
	// run() runs the task of the created thread
}
}
