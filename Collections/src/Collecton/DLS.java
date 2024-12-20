package Collecton;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DLS {
 public static void main(String[] args) {
	List l1=new LinkedList(Arrays.asList(10,22,3,4,6,6,43));
	l1.addFirst(12);
	l1.addLast(34);
//	l1.removeFirst();
//	l1.removeLast();
	//System.out.println(l1);
	//System.out.print(l1+" ");
	
//	Iterator itr=l1.iterator();
//	while(itr.hasNext())
//	{
//		System.out.print(itr.next()+" ");
//	}
//	System.out.println();
	System.out.println("Backword Iterator");
	
	ListIterator itr1=l1.listIterator();
	
	while(itr1.hasNext())
	{
		System.out.print(itr1.next()+" ");
	}
		System.out.println("Hello");
		while(itr1.hasPrevious())
		{
			System.out.print(itr1.previous()+" ");
		}
			
}
}
