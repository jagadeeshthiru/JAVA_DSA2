package Extraction;

public class Palindrome_even_odd_Number {
	public static void main(String[] args) {
		long num=422334433224l,rem=0,rev=0,temp=num;
		System.out.println(num);
		while(0<num)
		{
			rem=num%10;
			if(rem%2==0)
			{
				System.out.println("the even numbers are: "+rem);
			}
			else
			{
				System.out.println("the odd numbers are: "+rem);
			}
			rev=rev*10+rem;
			num =num/10;
		}
		System.out.println(rev);
		num=temp;
		if(rev==num)
		{
			System.out.println("it is a palindrome");
			
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
	}

}
