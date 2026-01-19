package threadcreation;
import java.util.concurrent.*;
public class CallableExample {
public static void main(String args[]) throws InterruptedException, ExecutionException {/*this execeptions are Checked Exceptions which
	which might be thrown by the future.get() by the result*/
	
	
	ExecutorService executor = Executors.newSingleThreadExecutor();//Created only one background thread like pool-1,Thread-1
	
    // Create a Callable task
    Callable<Integer> task = () -> {
        System.out.println("Task running in: " + Thread.currentThread().getName());
        return 50 + 25; // returns a value
    };

    // Submit task -> returns Future
    Future<Integer> future = executor.submit(task);//It's like a placeholder for the return value.
    //executor.submit(task) will make the call() method to complete the task and the result will be store in the placeholder.
        
    // Get the result (waits if needed)
    System.out.println("Result = " + future.get());

    executor.shutdown();//tells the thread pool to stop.
}
}
