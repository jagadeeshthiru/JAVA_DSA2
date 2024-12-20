package Patternmodel3;

public class Pattern1 {
  public static void main(String[] args) {
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		int temp=r;
		for(int c=5;c>=r;c--)
		{
			System.out.print("  ");
		}
		for(int z=1;z<=r;z++)
		{
			System.out.print("* ");
		    temp--;
		}
		for(int j=2;j<=r;j++)
		{
			System.out.print("* ");
			
		}
		
		
		System.out.println();
		
	}
	for(int r=2;r<=rows;r++)
	{
		int temp=r;
		for(int c=1;c<=r;c++)
		{
			System.out.print("  ");
		}
		for(int z=5;z>=r;z--)
		{
			System.out.print("* ");
		  
		}
        for(int j=5;j>r;j--)
        {
        	System.out.print("* ");
        	
        	
        }
		
		
		System.out.println();
		
	}
}
}
