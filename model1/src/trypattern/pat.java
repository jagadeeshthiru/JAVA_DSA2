package trypattern;

public class pat {
public static void main(String[] args) {
	int rows=5,cols=5;
	for(int r=0;r<=rows;r++)
	{	
       for(int c=r;c<rows;c++)
       {
    	   System.out.print("  ");
       }
       for(int z=1;z<=r;z++)
       {
    	   if(z==1||z==r||r==rows)
    	   System.out.print(z+"    ");
    	   else
    	   {
    		   System.out.print("     ");
    	   }
       }   
		System.out.println();
	}	
}
}
