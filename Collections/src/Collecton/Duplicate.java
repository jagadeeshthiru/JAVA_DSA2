package Collecton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
   public static void main(String[] args) {
	int a[]=new int[]{10,22,10,32,22,10,32,11,55,43,11,43};
	List list =new ArrayList();
	
	for(int x=0;x<=a.length-1;x++)
	{
	    list.add(a[x]);
		
	}
	for(Object temp:list)
	{
		if(list.indexOf(temp)!=list.lastIndexOf(temp))
		{
			set.add(temp);
			
		}
	}	
	System.out.println(set);
  }
}
