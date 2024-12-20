package com;

public class Main {
  int num=153;
   void prime()
   {
	   int count=0;
	   for(int x=1;x<=num;x++)
	   {
		 if(num%x==0)
		 {
			 count++;
		 }
	   }
	   if(count==2)
	   {
		   System.out.println("It is a Prime number");
	   }
	   else
	   {
		   System.out.println("It is not a prime number");
	   }
   }
	void palindrome()
	{
		int rev=0,rem=0,temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
		    num=num/10;
		}
		num=temp;
		if(num==rev)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}
	void armStrong()
	{
		int rev=0,rem=0,temp=num,sum=0,count=0,pow=0;
		while(num!=0)
		{
			rem=num%10;
			count++;
		    num=num/10;
		}
	  num=temp;
		while(num!=0)
		{
			rem=num%10;
		   pow=(int)Math.pow(rem, count);
		   sum=sum+pow;
		    num=num/10;
		}
		num=temp;
		if(num==sum)
		{
			System.out.println("It is a armstrong number");
		}
		else
		{
			System.out.println("It is a not Armstrong Number");
		}
	}
	void factor()
	{
		int start=1;
		while(start<=num)
		{
			if(num%start==0)
			{
				System.out.println(start);
				
			}
			start++;
		}
	}

public static void main(String[] args) {

	Main m1=new Main();
	m1.armStrong();
	m1.palindrome();
	m1.prime();
	m1.factor();
}
}
