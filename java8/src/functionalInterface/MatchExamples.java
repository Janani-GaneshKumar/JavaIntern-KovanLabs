package functionalInterface;
import java.util.*;
public class MatchExamples {
public static void main(String args[])
{
	List<Integer> nums = List.of(10, 20, 30, 5);

    boolean result = nums.stream()
                         .anyMatch(n -> n < 10);//check if atleast one element matches the condition

    System.out.println("anyMatch: " + result);
    
    boolean result1 =nums.stream().allMatch(n->n>0);
    System.out.println("allMatch: "+result1);
    
    boolean result2=nums.stream().noneMatch(n->n<0);
    System.out.println("noneMatch: "+result2);
    
  
}
}
