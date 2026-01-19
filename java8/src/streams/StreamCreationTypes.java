package streams;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationTypes {
public static void main(String args[]) {
	List<String> list = Arrays.asList("Java","Pyhton","c");
	Stream<String> s1= list.stream();//using collection to create a stream
	
	int[] arr = {1,2,3,4};
	IntStream s2=Arrays.stream(arr);//creating a stream from array
	
	Stream<Integer> s3=Stream.of(1,2,3,4);//using Stream.of() method
	
	Stream<Integer> s4= Stream.iterate(1, n->n+1).limit(5);
	s4.forEach(System.out::println);//using infinite stream
	
}
}
