package streams;
import java.util.*;
public class AverageOfaGivenNumbers {
public static void main(String args[]) {
	List<Integer> list =Arrays.asList(1,2,3,4,5);
	
	OptionalDouble average=list.stream().mapToDouble(n->n.doubleValue()).average();
	
	//In Java, OptionalDouble is a specialized container class from the java.util package that may or may not contain a double value.
}
}
