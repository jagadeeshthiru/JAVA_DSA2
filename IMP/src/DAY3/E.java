package DAY3;

public class E {
public static void main(String[] args) {
	int a[]=new int[] {10,20,30,40,50};
	int index=2;
	for(int x=index;x<a.length;x++)
	{
		if(x==a.length-1)
		{
			a[x]=0;
		}
		else
		{
			a[x]=a[x+1];
			
		}
		
	}
	for(int temp:a)
	{
		System.out.println(temp);
	}
}
}
