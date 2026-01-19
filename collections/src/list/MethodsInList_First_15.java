package list;
import java.util.*;
public class MethodsInList_First_15 {
public static void main(String args[]) {
	List<String> cars  = new ArrayList<String>();
	cars.add("Volvo");//Inserts element at the end of the list 1.add()
	cars.add(1, "Bmw");
	cars.add(2,"Audi");//Inserts element at the specific position 2.add(index,value)
	System.out.println(cars);
	
	
	//3.addAll(Collection c) example
	
	List<String> list = new ArrayList<>(List.of("A","B"));
	List<String> list1= List.of("C","D");
	list.addAll(list1);
	System.out.println(list);
	
	//4.addAll(index,collection c) example
	List<String> list2 = new ArrayList<>(List.of("A","D"));
	List<String> list3 = List.of("B","C");
	list2.addAll(1, list3);
	System.out.println(list2);
	
	//5.clear() example
	List<Integer> l= List.of(1,2);
	//l.clear(); System.out.println(l);shows error
	
	//6.equals(object) example
	List<Integer> l1= List.of(1,2);
	List<Integer> l2=List.of(1,2);
	System.out.println(l1.equals(l2));//true
	
	//7.hashCode() example
	System.out.println(l1.hashCode());
	
	//8.get(index)
	System.out.println(l2.get(1));//op 2
	
	//9. isEmpty()
	System.out.println(l1.isEmpty());//false
	
	//10.lastIndexOf(object ) example
	List<Integer> ob= List.of(2,5,3,5,7);
	System.out.println(ob.lastIndexOf(5));
	
	//11.toArray(object) - convert the list into object
	List<Integer> ob1= new ArrayList<>(List.of(1,2,3,4));
	Object[] n = ob1.toArray();
	for(Object i:n) {
		System.out.println(i);
	}
	//12.toArray() converts a list into an array
	List<Integer> list4 = new ArrayList<Integer>(List.of(1,2));
	Integer[] arr = list4.toArray(new Integer[list4.size()]);
	for(Integer i: arr) {
		System.out.println(i);
	}
	//13.contains(object)
	System.out.println(list4.contains(1));//true
	
	//14.containsAll(collection c)
    System.out.println(	l1.containsAll(l2));//true
    
    //15.indexOf(object) returns the first index of the object
    System.out.println(ob.indexOf(5));//1
    
}
}
