package DAY1;

public class MAIN {
	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,20,90};
		int b[]=new int[a.length],sum=0;
		for(int x=0;x<=a.length-1;x++)
		{
			sum=sum+a[x];
			
		}
		System.out.println(sum);
		System.out.println("_____________");
		for(int x=0;x<=a.length-1;x++)
		{
			b[x]=sum/a[x];
			System.out.println(b[x]);
		}
	}
}
