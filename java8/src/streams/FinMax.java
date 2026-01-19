package streams;
import java.util.*;
public class FinMax {
public static void main(String args[]) {
	List<Integer> list =Arrays.asList(1,2,3,4,5);
	//mapToInt(n->n.intValue) it converts the object stream into primitive int coz max() works only with primitive types.
	int max=list.stream().mapToInt(n->n.intValue()).max().orElseThrow();
	System.out.println("Max: "+max);
}
}
