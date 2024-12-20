package RECURRSION;

import java.util.Scanner;

class Demo
{
	public void palin(int num,int rem,int rev,int temp)
	{
		
		if(num==0)
		{
			System.out.println(rev);
			num=temp;
			//System.out.println(num);
			if(num==rev)
			{
				System.out.println("Palindrome");
			}
			else
			{
				 System.out.println("Not palindrome");
			}
		}
		else
		{
			rem=num%10;
			rev=rev*10+rem;
			palin(num/10,rem,rev,temp);
		}
	}
}
public class Main {
public static void main(String[] args) {
	Demo d1=new Demo();
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR VALUES");
	int num=sc.nextInt();
	int rem=sc.nextInt();
	int rev=sc.nextInt();
	int temp=sc.nextInt();
    d1.palin(num,rem,rev,temp);
	
}
}
