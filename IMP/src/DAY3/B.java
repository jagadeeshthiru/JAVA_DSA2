package DAY3;

public class B {
    public static void main(String[] args) {
	   int a[]=new int[] {10,20,30,40,50,60};
	   int b[]=new int [a.length];
	   int c[]=new int [a.length];
	   int d[]=new int [a.length];
	   for(int x=0;x<(a.length)/2;x++)
	   {   
			   b[x]=a[x];   
	   }	 
	   for(int x=0;x<a.length;x++)
	   {
         System.out.println(b[x]);
	   }
	   
	   
	}
}
