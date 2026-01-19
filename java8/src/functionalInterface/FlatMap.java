package functionalInterface;
import java.util.*;
public class FlatMap {
public static void main(String args[]) {
	 List<String> words = List.of("Hello", "World");

     // map(): convert each word to uppercase
     List<String> upper =
             words.stream()
                  .map(str -> str.toUpperCase())
                  .toList();

     // flatMap(): split each word into letters and flatten (one input value returns multiple values)(Each string becomes multiple characters)
     List<String> letters =
             words.stream()
                  .flatMap(str -> Arrays.stream(str.split("")))
                  .toList();

     System.out.println("Using map(): " + upper);
     System.out.println("Using flatMap(): " + letters);
}
}
