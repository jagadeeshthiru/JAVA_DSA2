package com;

public class Fibonacci {
	 public static void main(String[] args) {
		
	int a=0,b=1,start=1,c=0,end=10;

	while(start<=end) 
	{
		c=a+b; //0=0+1=1 1+1=2 1+2=3 2+3=5 3+5 =8 13
		System.out.println(a); //0 1 1 2 3 5
		a=b; //1 1 2 3 5
		b=c; //1 2 3 5 8 
		start++;
	}

			
		
	}
}
