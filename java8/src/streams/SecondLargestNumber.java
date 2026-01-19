package streams;
import java.util.*;
public class SecondLargestNumber {
public static void main(String args[]) {
	List<Integer> list= Arrays.asList(1,2,3,4,5);
	//Optional<> is introduced in Java because before There was so much null value and nullpointerException to avoid this it is used.
	Optional<Integer> secondLargest =list.stream().sorted((num1,num2)->num2-num1).skip(1).findFirst();
	System.out.println("Second Largest: "+(secondLargest.isPresent() ? secondLargest.get() : "N/A"));
}
}
