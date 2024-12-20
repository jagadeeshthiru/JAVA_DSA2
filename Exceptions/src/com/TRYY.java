package com;

public class TRYY {
   public static void main(String[] args) {
	  
	
}
   public static void readfile()
   {
	   try(System.out.println(10/0))
		  {
		         
		      }
		  catch(ArithmeticException ae)
		  {
			  System.out.println("Handle");
		  }
   }
}
