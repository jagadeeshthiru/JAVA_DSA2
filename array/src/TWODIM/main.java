package TWODIM;

public class main {
	
public static void main(String[] args) {
	int a[][]=new int[][]{{24322,13,43,54,89},
		                    {32,44,33322,56,45}};
		                    
		                    
//		                    
//		                    for (int i = 0; i < a.length; i++) {
//		             	       for (int j = 0; j <a[i].length; j++) {
//		             		   System.out.print(a[i][j]+"\t");
//		             		   
//		             			
//		             		}
//		             	    System.out.println();   
//		             		
//		             	}
//		                 System.out.println("Number: "+a[1][3]);
		                    
   // or
//		a[0][0]=22;
//		a[0][1]=33
//		a[0][2]=32;
//		a[1][1]=344;
//		a[1][2]=32;
		                    
		                    
    int rows=2;
    int col=5;
		                    
    for (int i = 0; i < rows; i++) {
	       for (int j = 0; j < col; j++) {
		   System.out.print(a[i][j]+"\t");
		   
			
		}
	    System.out.println();   
		
	}
    System.out.println("Number: "+a[1][3]);
	
}
}
