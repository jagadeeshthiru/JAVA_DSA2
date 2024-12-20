package Patternmodel2;

public class pattern11 {
   public static void main(String[] args) {
	int rows=4,cols=5;
	for(int r=1;r<=rows;r++) //1 
	{
		int temp1=0;
		int temp2=1;
		for(int c=1;c<=cols;c++)//1
		{
			if((r+c)%2==0) //(1+1)%2==0 //(2+1)%2==0 (3+1)%2==0 (4+1)%2==0 (5+1)%2==0
			{
				System.out.print(temp2+" ");
			}
			else
			{
				System.out.print(temp1+" ");
			}
			
		}
		System.out.println();
	}
}
}
