package DAY3;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	int a[]=new int[]{10,20,30,40,50,60};
    int b[]=new int [a.length];
    for(int x=0;x<b.length;x++)
    {
    	if(x==0)
    	{
    		b[x]=a[x]+a[x+1];
    		b[x+1]=a[x]+a[x+2];
    	}
        
    	else if(x==a.length-1)
		{
			b[x]=a[a.length-1]+a[a.length-2];
			
		}
    	else
    	{
    		b[x+1]=a[x+1]+a[x+1];
    	}
    }
    for(int x=0;x<b.length;x++)
    {
    	System.out.println(b[x]);
    }
    
}
}
