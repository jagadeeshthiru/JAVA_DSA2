package Pattern;

public class PAT {
public static void main(String[] args) {
	int rows=5,cols=5;
	
	
	for(int r=1;r<=rows;r++)
	{
	    for(int c=1;c<=r;c++)
	    {
	        //if(c==1)	
	    	System.out.print("* ");
	        //else
	        	//System.out.println(" ");	
	    }
	    
	    System.out.println();
	}
	for(int r=1;r<=rows;r++)
	{
		for(int c=cols;c>r;c--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
