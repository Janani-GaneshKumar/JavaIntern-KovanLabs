package streams;
import java.util.*;
import java.util.stream.Collectors;
public class AlphabeticalSorting {
public static void main(String args[]) {
	List<String> list = Arrays.asList("banana","apple","orange","guava");
	List<String> sorted=list.stream().sorted().collect(Collectors.toList());
	System.out.println(sorted);
			
}
}
