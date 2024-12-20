package Patternmodel2;

public class Pattern8 {
public static void main(String[] args) {
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print("# ");
		}
		System.out.println();
	}
	for(int r=rows-1;r>=1;r--)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print("# ");
		}
		System.out.println();
	}
}
}
