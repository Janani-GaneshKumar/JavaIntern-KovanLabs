package threadcreation;
import java.lang.*;
public class MyTask implements Runnable{
public static void main(String args[]) {
	Runnable r = new MyTask();//It defines the task for the thread
	
	Thread t = new Thread(r);//with the thread object creation the task is also passed 
	
	t.start();
}
@Override
public void run() {
	System.out.println("running: "+Thread.currentThread().getName());
}
}
