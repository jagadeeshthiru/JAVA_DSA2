package Patternmodel2;

public class Pattern12 {
public static void main(String[] args) {
	int rows=7,cols=5;
	for(int r=1;r<=rows;r++)
	{
		int temp1=0;
		int temp2=1;
		for(int c=1;c<=cols;c++) //1 2 3 4 5 
		{
			
			if(c%2==0||r%2==0)
			{
				System.out.print(temp1+" ");
			}
			else
			{
				System.out.print(temp2+" ");
			}
		
		}
		System.out.println();
	}
}
}
