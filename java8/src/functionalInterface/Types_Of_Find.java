package functionalInterface;
import java.util.*;
public class Types_Of_Find {
public static void main(String args[]) {
	 List<String> list = List.of("Apple", "Banana", "Cat", "Dog");

     Optional<String> first =
             list.stream()
                 .findFirst();

     System.out.println("findFirst: " + first.get());
     
     Optional<String> any=list.stream().findAny();
     
     System.out.println("findAny: "+any.get());
}
}
