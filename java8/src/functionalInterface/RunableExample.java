package functionalInterface;
import java.lang.*;
public class RunableExample implements Runnable{
public static void main(String args[]) {
	System.out.println("The Main Thread is: "+Thread.currentThread().getName());
}

@Override
public void run() {

	
}
}
