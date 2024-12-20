package Practice;

public class Sum {
public static void main(String[] args) {
	int a[]=new int[] {1,2,3,4,5},sum=0;
	int b[]=new int[a.length];
	for(int x=0;x<a.length;x++)
	{
		sum=sum+a[x];
	}
	//System.out.println(sum);
	for(int x=a.length-1;x>=0;x--)
	{
		
		b[x]=sum-1;
		sum--;
		System.out.println(b[x]);
	}
	
	
	
}
}
