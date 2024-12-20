package Practice;

public class unique {
 public static void main(String[] args) {
	int a[]=new int[]{2,3,4,5,6,7,2,4,5};

	for(int x=0;x<=a.length-1;x++)
	{
		int count=0;
		for(int y=0;y<=a.length-1;y++)
		{
			if(a[x]==a[y])//2==2 
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Duplicate elements are: "+a[x]);
		}
	}
	
}
}
