package streams;
import java.util.*;
//does how many strings contain the given character
public class Char_in_String {
public static void main(String args[]) {
	List<String> list = Arrays.asList("apple","banana","cat");
	char search='a';
	long count=list.stream().filter(str->str.contains(String.valueOf(search))).count();
	System.out.println(count);//op 3
	
}
}
