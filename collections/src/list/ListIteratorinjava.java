package list;
import java.util.*;
public class ListIteratorinjava {
public static void main(String args[]) {
	List<Integer> list = new ArrayList<>(List.of(2,3,4));
	ListIterator it = list.listIterator();
	//1.add(object) adds element at the iterators's current position aka at front in this case
	it.add(0);
	System.out.println(list);
	System.out.println(it.hasNext());
	System.out.println(it.next());//prints 2 
	System.out.println(it.nextIndex());//2 
	System.out.println(it.hasPrevious());
	System.out.println(it.previous());
	System.out.println(it.previousIndex());
	it.remove();//removes 2
	System.out.println(it.next());
	System.out.println(list);
	it.set(8);
	System.out.println(list);
	
	
}
}
