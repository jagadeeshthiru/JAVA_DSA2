package Practice;

public class maincls {
 public static void main(String[] args) {
	int a[]=new int[] {11,22,33,44,55,66,77,88,98};
	int b[]=new int[a.length];
	System.out.println("Even index/elements");
	for(int x=0;x<a.length;x++)
	{
		 b[x]=a[x];
		 if(a[x]%2==0)
		 {
			 System.out.println(x+" "+b[x]);
		 }
	}
	System.out.println("odd index/elements");
	for(int x=0;x<a.length;x++)
	{
		 b[x]=a[x];
		 if(x%2!=0)
		 {
			 System.out.println(x+" "+b[x]);
		 }
	}
}
}
