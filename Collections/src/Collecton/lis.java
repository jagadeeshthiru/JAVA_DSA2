package Collecton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class lis {
public static void main(String[] args) {
	 List<Integer> list=new ArrayList(Arrays.asList(10,21,11,23,43,122,18));
	 Collections.sort(list);
	 System.out.println(list);
	 list.remove(list.size()-1);
	 System.out.println(list);
	 ListIterator<Integer> ite=list.listIterator();
	 
	 
	 while(ite.hasNext())
	 {
		 System.out.print(ite.next()+" ");
	 }
	 System.out.println();
	 while(ite.hasPrevious())
	 {
		 System.out.print(ite.previous()+" "); 
	 }
}
}
