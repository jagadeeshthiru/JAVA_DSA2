package Patternmodel2;

public class Pattern6 {
   public static void main(String[] args) {
	   int rows=5,cols=5;
	   char letter='A',letter2='a';
	    for(int r=1;r<=rows;r++) 
	    { 
	    	
	    	for(int c=1;c<=cols;c++) //1<=5 2<=5
	    	{
	    		if(r%2==0)
	    		{
	    			System.out.print(letter2+" ");
	    			letter2++;
	    		}
	    		else
	    		{
	    			System.out.print(letter+" ");
	    			letter++;
	    		}
	    		
	    	}
	    	
	   
	    	
	    	System.out.println();
	    }
    }
    }

