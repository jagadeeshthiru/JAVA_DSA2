package array;

public class Maincls2 {
public static void main(String[] args) {
	int a[]=new int[] {10,-20,30,-2,34,-12,9,-7,34,0};
	int b[]=new int[a.length];
	System.out.println("B Array elements are");
	for(int x=0;x<a.length;x++)
	{
		b[x]=a[x];
		
		  if(a[x]<0)
		   {	
			  System.out.println(b[x]);
		   }
		  
		
		
	}
	for(int x=0;x<a.length;x++)
	{
		b[x]=a[x];
		
		  if(a[x]>0)
		   {	
			  System.out.println(b[x]);
		   }
		  else if(a[x]==0)
		  {
			  System.out.println(b[x]);
		  }
		  
		
		
	}
	
}
}
