package streams;
import java.util.*;
import java.util.stream.Collectors;
public class UpperCase {
public static void main(String args[]) {
	List<String> list =Arrays.asList("janani","kavya","yamini");
	List<String> upperCase=list.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
	System.out.println(upperCase);
}
}
