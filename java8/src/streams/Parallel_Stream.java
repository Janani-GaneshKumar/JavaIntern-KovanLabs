package streams;
import java.util.*;
public class Parallel_Stream {
public static void main(String args[]) {
	List<Integer> numbers = List.of(1, 2, 3, 4, 5);
	numbers.stream()
	       .forEach(n -> System.out.println(n + " " + Thread.currentThread().getName()));//sequential thread.
	
  numbers.parallelStream().forEach(m->System.out.println(m+" "+Thread.currentThread().getName()));
  //parallel stream uses multiple threads to run multiple tasks 
  
}
}
