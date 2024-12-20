package Extraction;

import java.util.Scanner;

public class MinimumDigit {
	public static void main(String[] args) 
	   {
		   Scanner sc =new Scanner(System.in);
		   System.out.println("Enter your number");
		   int num =sc.nextInt();
		   int rem=0,min=10;
		   while (num>0) 
		   {
			 rem =num%10;
			 num=num/10;
			 if (rem<=min) 
			 {
		         min =rem;
			 }
			
	    }
		   System.out.println("the MIN value is : "+min);
	}
}
