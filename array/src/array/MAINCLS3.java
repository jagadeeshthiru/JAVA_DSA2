package array;

public class MAINCLS3 {
public static void main(String[] args) {
	int a[]=new int[] {10,20,30,40,50};
	int b[]=new int[a.length];
	int sum=0;
	for(int x=0;x<=a.length;x++)
	{
		if(x==0)
		{
			b[x]=a[0]+a[1];
			
		}
		else if(x==a.length-1)
		{
			b[x]=a[a.length-1]+a[a.length-2];
			
		}
		
	}
}
}
