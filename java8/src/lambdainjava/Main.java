package lambdainjava;
import java.util.*;
public class Main implements Runnable {
public static void main(String args[]) {
	Sayable s = ()->//No parameter
	{
		return "I have nothing to say";
	};
	System.out.println(s.display());
	Sayable1 s1 =(name)->{//Single Parameter
		return "hello"+name;
	};
	System.out.println(s1.display("janani"));
	Sayable2 s2=(name1,name2)->{//Two parameters
		return "Hello"+name1+" "+name2;
	};
	
	System.out.println(s2.display("janani", "Kavya"));
	
	Add add = (a,b)->a+b;//lambda without  return keyword
	int result=add.add(10, 10);
	System.out.println(result);
	
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.forEach((n)->System.out.println(n));
	Sayable3 s3=(name1)->{
		String a="janani";
		String b=a+"kavya";
		return b;
	};
	System.out.println(s3.say("hello"));
	
	Runnable r1=()->{
		System.out.println("Thread is running");
	};
	Thread t1 = new Thread(r1);
	t1.start();
}

@Override
public void run() {
	// TODO Auto-generated method stub
	
}
}
