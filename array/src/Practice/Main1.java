package Practice;

public class Main1 {
	public static void main(String[] args) {
		int a[]=new int[]{20,30,40,50,10};
		int b[]=new int[a.length];
		System.out.println("a array element");
		for(int x=0;x<=a.length-1;x++)
		{
			b[x]=a[x];
			System.out.println(a[x]);
			
		}
		System.out.println("b array element");
		for(int y=b.length-1;y>=0;y--)
		{
			System.out.println(b[y]);
		}
	}
}
