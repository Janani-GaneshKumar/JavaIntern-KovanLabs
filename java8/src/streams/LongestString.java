package streams;
import java.util.*;
public class LongestString {
public static void main(String args[]) {
   List<String> list = Arrays.asList("Apple","Banana","Guava","Grapes","Orange");
   Optional<String> longest =list.stream().max((str1,str2)->str1.length()-str2.length());  
   System.out.println(longest);
   
   //Optional<T> is a container object introduced in Java 8.It may or may not contain a value.
}
}
