package Practice;

public class main {
	public static void main(String[] args) {
		int a[]=new int[]{20,30,40,50,10};
		int b[]=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			b[x]=a[x];
			
		}
		System.out.println("a array elements");
		for(int x=0;x<=a.length-1;x++)
		{
			
			System.out.println(a[x]);
		}
		System.out.println("b array elements");
		for(int x=0;x<=b.length-1;x++)
		{
			
			System.out.println(b[x]);
		}
		
	}

}
