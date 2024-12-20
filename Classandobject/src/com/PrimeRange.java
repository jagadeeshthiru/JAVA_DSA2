package com;

public class PrimeRange {
	
	public void prime(int x,int last)//1,1,0
	{
		
		for(;x<=last;x++)//1<=100
		{
		  int num=x;//1
		  int s=1,count=0;
		 
		  for(;s<=num;s++)
		  {
			  if(num%s==0)
			  {
				  count++;
			  }
				  
		  }
		  if(count==2)
		  {
			  System.out.println(num+" :prime");
		  }
				  
		}
	}
			
  
		
	
public static void main(String[] args) {
	PrimeRange p1=new PrimeRange();
			p1.prime(1,10000);
}
}
