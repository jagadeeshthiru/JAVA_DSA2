package set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Haset {
   public static void main(String[] args) {
	   Integer k=4;
	   Integer c=0;
	TreeSet set=new TreeSet(Arrays.asList(89,34,56,78,23,10,0));//c=99
	set.add(10);
	System.out.println(set);
	 c=0;
	for(Object temp:set)
	{
		c++;
		if(c==k)
		{
			System.out.println(temp);
		}
		
		
		
	}
	
   Iterator itr=set.iterator();
   while(itr.hasNext())
   {
   	System.out.print(itr.next()+" ");
   }
	
   
	
	
}
}
