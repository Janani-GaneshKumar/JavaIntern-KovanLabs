package arraylistrevision;
import java.util.*;
public class First_10_Methods {
public static void main(String args[]) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(5,60);
	
	ArrayList<Integer>list1= new ArrayList<Integer>(List.of(1,2,5));
	ArrayList<Integer> list2 = new ArrayList<Integer>(List.of(3,4));
	list1.addAll(list2);
	System.out.println(list1);
	
	list1.addAll(2,list2);
	System.out.println(list1);
	//list1.clear();TC -O(n),SC -O(1)
	
	list1.ensureCapacity(100);
	System.out.println(list1.get(0));
	System.out.println(list1.isEmpty());
	
	System.out.println(list1.lastIndexOf(Integer.valueOf(4)));
	Object[] arr = list1.toArray();
	for(Object i:arr) {
		System.out.print(i+" ");
	}
	Integer[] arr1 = list1.toArray(new Integer[10]);
	for(Integer i:arr1) {
		System.out.println(i);
	}
	System.out.println(list1.clone());
	System.out.println(list1.contains(4));
	System.out.println(list1.indexOf(4));
     list1.remove(5);
     list1.removeAll(List.of(4,5));	
     System.out.println(list1);
     list1.removeIf(x->x%2==0);
     System.out.println(list1);
     
     ArrayList<Integer> list3= new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
    // list3.removeRange(5,9); not working
     list3.replaceAll(x->x*10);
     System.out.println(list3);
     list3.retainAll(List.of(10,20,30,40,50));
     System.out.println(list3);
     System.out.println(list3.subList(0, 4));
     ArrayList<Integer> list4= new ArrayList<Integer>(10);
     list4.add(10);
     list4.add(20);
     System.out.println(list4.size());
     
}

}
