package streams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class IntermediateOperations {
public static void main(String args[]) {
	List<Integer> list=Arrays.asList(5,10,20,30);
	
	
list.stream().filter(n->n>10).map(n->n*2).sorted().distinct().skip(0).forEach(System.out::println);

	List<Integer>s=list.stream().collect(Collectors.toList());//Collecting a list of elements into a stream
	int sum=list.stream().reduce(0,(a,b)->a+b);
	System.out.println(sum);
	System.out.println(list.stream().count());
	//parallel stream
	 List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
     numbers.parallelStream().forEach(n -> System.out.println(n + " " + Thread.currentThread().getName()));
 
	
}

}
