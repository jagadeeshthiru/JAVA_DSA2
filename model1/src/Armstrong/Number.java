package Armstrong;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		int rem=0,count=0,temp=num,start=1,power=0,sum=0;
		while(num>0)
		{
			rem =num%10;
			count=count+1;
		
			System.out.println(rem);
			num=num/10;	
		}
		
		System.out.println("total count is: "+count);
	num=temp;

		while(num>0)
		{
			rem =num%10;
			power =(int)Math.pow(rem, count);
			sum=sum+power;
			
			num=num/10;
		}
		System.out.println("the sum of number: "+sum);
		start++;
		if(sum==temp)
		{
			System.out.println(temp+" :It is a Armstrong number");
		}
		else
		{
			System.out.println(temp+": it is not a armstrong number");
		}
	}
}
