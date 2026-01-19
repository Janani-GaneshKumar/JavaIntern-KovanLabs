package arraylist;
import java.util.*;
public class Methods_In_ArrayList {
public static void main(String args[]) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	//1.add()
	list.add(1);//TC-O(1) SC-O(1)
	//2.add(index,value)
	list.add(1,2);//TC-O(n) SC O(1)
	//3.addAll(Collection)
	ArrayList<Integer> list1 = new ArrayList<>( List.of(3,4));
	list.addAll(list1);//Tc-O(m) Sc -O(1)
	//4.addAll(index,Collection)
	list.addAll(1, list1); //Tc -O(n+m) sc-o(1)
	System.out.println(list);
	//5.clear()
	list.clear();//TC-O(n) Sc-o(1)
	//6.ensureCapacity()
	ArrayList<Integer> list2 = new ArrayList<>();
	list2.ensureCapacity(100);//tc-o(1) sc-o(1)
	System.out.println(list1.get(0));//TC-O(1),SC -O(1)
	System.out.println(list1.isEmpty());//TC-O(1) SC-O(1)
	Iterator<Integer> it = list1.iterator();
	while(it.hasNext()) {//TC-O(n),SC-O(1)
		System.out.println(it.next());
	}
	ListIterator<Integer> it1= list1.listIterator();//TC-O(1) except Iteration has O(n) SC-O(n)
	System.out.println(list.lastIndexOf(Integer.valueOf(4)));//TC-O(1),SC-O(1)
	
	
	
}
}
