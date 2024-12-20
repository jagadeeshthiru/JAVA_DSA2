package Patternmodel2;

public class pattern9 {
  public static void main(String[] args) {
	int rows=5;
	for(int r=1;r<=rows;r++)
	{ 
		int temp=r;
	for(int c=1;c<=r;c++) 
		{
			if(r==rows||c==1||r==c) 
			{
			System.out.print(temp+" ");
			temp--;
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
