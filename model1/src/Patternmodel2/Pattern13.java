package Patternmodel2;

public class Pattern13 {
  public static void main(String[] args) {
	int rows=5;
	for(int r=rows;r>=1;r--) //1
	{
		int temp=r;
		for(int c=1;c<=r;c++)  
		{
			int temp1=c;
		  if(r%2!=0)
		  {
			System.out.print(temp+" ");
			temp--;
		  }
		  else
		  {
			  System.out.print(temp1+" ");
			  temp1++;
		  }
		
		}
		
	
		System.out.println();
	}
}
}
