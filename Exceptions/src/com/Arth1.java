package com;

public class Arth1 {
	 public static void main(String[] args) {
		  Arth a1=new Arth();
		  a1.m1(10,0);
	   }
	    
	    public void m1(int a,int b)
	    {
	        try{
	    	     System.out.println(a/b);
	          }
	        catch(ArithmeticException ae)
	        {
	        	
	        }
	        finally {
	   	       System.out.println("the code handle by the exception");
	   	  System.out.println("Hello");
	   	
	   	       
	        }
	   	     
	   	       
	   	     }
}
