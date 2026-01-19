package streams;
import java.util.*;
import java.util.stream.Collectors;
public class Concatenation {
public static void main(String args[]) {
	List<String> list =Arrays.asList("Apple","Banana","Guava");
   String concat = list.stream().collect(Collectors.joining());
   System.out.println(concat);
}
}
