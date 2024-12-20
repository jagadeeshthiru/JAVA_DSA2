package DAY2;

public class Pat2 {
public static void main(String[] args) {
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		int n=1;
		for(int c=rows;c>=r;c--)
		{
			System.out.print("  ");
		}
		for(int d=1;d<=r;d++)
		{
			if(r==5||r+d==rows+1)
			{
				System.out.print(d+" ");
				
			}
			else
			{
				System.out.print(" ");
			}
		}
		
	
		System.out.println();
	}
}
}
