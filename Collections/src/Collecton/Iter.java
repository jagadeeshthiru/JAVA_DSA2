package Collecton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
public class Iter {
  public static void main(String[] args) {
	int arr[]=new int[] {22,33,4,54,89,1};
	
	TreeSet<Integer> al =new TreeSet();
	for(int temp: arr)
	{
		al.add(temp);
		
	}
	   
	System.out.println(al);
	Iterator ite=al.descendingIterator();
	
	while(ite.hasNext())
	{
		System.out.print (ite.next()+" ");
	}
        
	  
  
   //LISTITERATOR
	System.out.println();
	   int ar[]=new int[] {232,2434,546,665,74};
	   List list=new ArrayList();
	   
	   for(int temp: ar)
		{
			list.add(temp);
			
		}
	   
	   System.out.println();
	   ListIterator iter=list.listIterator();
	   while(iter.hasNext())
	   {
		   System.out.print(iter.next()+" ");
	   }
	   System.out.println();
	   while(iter.hasPrevious())
	   {
		   System.out.print(iter.previous()+" ");
	   }
   }
}
