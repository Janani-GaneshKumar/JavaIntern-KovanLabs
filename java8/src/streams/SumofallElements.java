package streams;
import java.util.*;
public class SumofallElements {
public static  void main(String args[]) {
	List<Integer> list = Arrays.asList(1,2,3,4,5);
	//mapToInt converts each Integer object in the stream to a primitive int.
	int sum=list.stream().mapToInt(n->n.intValue()).sum();//sum() works on int streams, not Integer objects.
	System.out.println(sum);
}
}