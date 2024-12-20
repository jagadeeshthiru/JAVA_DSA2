package array;

public class Mainclass1 {
public static void main(String[] args) {
	int a[]=new int[]{10,20,30,40,50,60};
	int b[]=new int[a.length];
	int c[]=new int[b.length];
	int count=0;
	System.out.println("b array element: ");
	for(int x=0;x<a.length/2;x++)
	{
		
	    b[x]=a[x];
		System.out.println(b[x]);
	}
	System.out.println("c array elemnts are:  ");
	for(int x=0;x<a.length;x++)
	{
		c[x]=a[x];
		if(x>=(a.length)/2) //0>=4f 1>=4f 2>=4f 3>=4f 4>=4t
		{
		System.out.println(c[x]); //50 60 34 87
		}
	}
	System.out.println("last answer");
	for(int x=0;x<a.length/2;x++)
	{
		b[x]=a[x];
		//System.out.println(b[x]);
		
	}
	for(int x=a.length-1;x>1;x--)
	{
		c[x]=a[x];
		if(x>=(a.length)/2)
		{
		//System.out.println(c[x]);
		}
	}
	
	
	
	
	
}
}
