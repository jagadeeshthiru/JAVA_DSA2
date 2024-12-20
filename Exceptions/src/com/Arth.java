package com;

public class Arth {
    public static void main(String[] args) {
	  Arth a1=new Arth();
	  a1.m1(10,0);
   }
    
    public void m1(int a,int b)
    {
        try{
        	 System.out.println("Before the exception");
    	     System.out.println(a/b);
           } 
        catch(ArithmeticException ae)
        {
           System.out.println("EXCEPTION HANDLE");
        }
        finally {
   	       System.out.println("the code handle by the exception");
   	       try {
   	      int arr[]=new int[-1];
   	         for(int x=0;x<=arr.length;x++)
   	         {
   	        	 System.out.println(arr[x]);
   	         }
   	       }
   	       catch(NegativeArraySizeException Nar)
   	       {
   	    	   System.out.println("Exception handle by catch");
   	       }
   	       finally {
   	       System.out.println("Final output");
   	       }
        }     
   	     }
    }
