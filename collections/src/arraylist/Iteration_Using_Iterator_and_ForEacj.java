package arraylist;
import java.util.*;
public class Iteration_Using_Iterator_and_ForEacj {
public static void main(String args[]) {
	ArrayList<String> cars = new ArrayList<>();
	cars.add("Volvo");
	cars.add("Audi");
	cars.add("BMW");
	cars.add("Ford");
	Iterator it = cars.iterator();
	it.next();
	it.forEachRemaining(s->System.out.println(s));
	
	Collections.sort(cars);
	for(String i: cars) {
		System.out.print(i+" ");
	}
	System.out.println("\n");
	Collections.sort(cars,Collections.reverseOrder());
	for(String i: cars) {
		System.out.print(i+" ");
	}
	
	
}
}
