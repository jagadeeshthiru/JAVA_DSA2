package DAY3;

public class SELECTION {
   public static void main(String[] args) {
	int a[]=new int[] {12,34,21,33,8,4,38};
	for(int x=0;x<a.length-1;x++)
	{
		
		for(int y=0;y<a.length-1-x;y++)
		{
			if(a[y]>a[y+1])
			{
				int t=a[y];
				a[y]=a[y+1];
				a[y+1]=t;
			}
		}
		
	}
	for(int temp:a)
	{
		System.out.println(temp);
	}
	
}
}
