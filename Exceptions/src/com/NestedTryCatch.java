package com;

public class NestedTryCatch {
public static void main(String[] args) {
     try {
    	 
    	try {
				System.out.println(10/0);
			
		  } 
    	   catch (ArithmeticException  ae) 
    	  {
			 System.out.println(" Are exception handle Exception");
		  }
    	System.out.println(10/0);
     }
     catch (ArithmeticException e) {
		System.out.println("Arithmetic handle");
     }
}
}
