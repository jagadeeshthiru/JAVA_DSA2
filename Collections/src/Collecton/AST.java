package Collecton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class AST {
	public static void main(String...argos) {
		   
	   List<Integer> l1=new ArrayList<>(Arrays.asList(10,33,2,4,67,4));
	   List l2=new ArrayList<>(Arrays.asList(10,33,2,4,67,4));
	   List<Object>  l3=new ArrayList();
	   l3.add(10);
	   l3.add(12);
	   l3.add(null);
	   l3.add(3,null);
	   l3.add(12);
	   l3.add(15);
	   l3.add(null);
	   l3.add(17);
	   Collections.max(l2);
	     System.out.println( Collections.min(l2));
	     System.out.println( Collections.max(l2));
	    System.out.println(Collections.frequency(l2, 4));

	   Collections.sort(l2);
	   
	   System.out.println(l2);
//   		l1.add(10);
//		l1.add(20);
//		l1.add( 20);
//		l1.add(13);
//		l1.add(22);
//		l1.add(15);
//		l1.add(18);
//		l1.add(4, 15);
//	    System.out.println(l1);
//	    l1.addAll(l1);
//		System.out.println(l1);
//		System.out.println(l1.set(10, null));
//		System.out.println(l1.get(3));
//		System.out.println(l1.size());
//		System.out.println(l1);
//		System.out.println(l1.remove(0));
//		System.out.println(l1.indexOf(10));
		
	}
}
