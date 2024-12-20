package y2;

import java.util.Arrays;

public class Sortt {
	static void srr(int x)
	{
		int a[]=new int[] {2,3,4,2,3,5,6,7};
		   for(;x<a.length-1;x++)
		   {
			   int s=0;
			   if(a[x]>a[x+1])
			   {
			      int temp=a[x];
				  a[x]=a[x+1];
				  a[x+1]=temp;
				  x=-1;
		       }		  
		   }
		   for(int temp:a)
		   {
			  System.out.println(temp);
	   }
		   System.out.println();		
		   //System.out.println(x);
		  
		   for(int i=0;i<=a.length-1;i++)
		   {
		   	   int count=1;
		   	   if(a[i]==1)
		   		   continue;
		   	   for(int j=i+1;j<=a.length-1;j++)
		   	   {
		   		   if(a[i]==a[j])
		   		   {
		   			 count++;
		   			 a[j]=1;
		   		   }
		   	   }
		   	   System.out.println(a[i]);
		   }   
	}
	
	
public static void main(String[] args) {
	srr(0);
	
}
}


