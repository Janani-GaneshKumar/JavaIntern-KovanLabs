package list;
import java.util.*;
public class MethodsinList_Next_10 {
public static void main(String args[]) {
	//16.remove(index)
	List<Integer> list = new ArrayList<>(List.of(1,2,3,4,2,2,4));
	list.remove(2);
	System.out.println(list);
	
	//17.remove(object) removes the first occurrence of the object
	list.remove(Integer.valueOf(2));
	System.out.println(list);
	
	//18.removeAll() removes the given values in the collection
	
	list.removeAll(List.of(2,3));
	System.out.println(list);
	//19.replaceAll(unaryoperator,operator)
	List<String> ob = new ArrayList<String>(List.of("A","B"));
	ob.replaceAll(s->s.toUpperCase());
	System.out.println(ob);
	//20.retainsAll(collection) keeps only the specified elements
	list.retainAll(List.of(1));
	System.out.println(list);
	
	//21 set(index,value)
	List<Integer> i = new ArrayList<Integer>();
	i.add(0,3);
	i.set(0, 1);
	System.out.println(i);
	//22.subList()
	List<Integer> in = new ArrayList<>(List.of(1,2,3,4,5,6));
	List<Integer> in1 = in.subList(0, 3);
	System.out.println(in1);
	//23.size()
	System.out.println(in1.size());
}
}
