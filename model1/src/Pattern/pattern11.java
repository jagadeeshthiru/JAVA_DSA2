package Pattern;

public class pattern11 {
	public static void main(String[] args) {
		int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			if(r%2==0)
				
				for(int c=cols;c>=1;c--)
				{
					System.out.print(c+" ");
				}
			
			for(int c=1;c<=cols;c++)
			{ 
				if(r%2!=0)
	            
				System.out.print(c+" ");
				
					
				
			}
			
			System.out.println();
	}

}
}
