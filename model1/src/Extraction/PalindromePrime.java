package Extraction;

public class PalindromePrime {
	public static void main(String[] args) {
		int num=121,rem=0,temp=num,count=0,rev=0;
		//dought;
		
		while(0<num)
		{
			rem=num%10;
			rev=rev*10+rem;
			num =num/10;
		}
		System.out.println(rev);
		num=temp;
		if(rev==num)
		{
			for(int i=1;i<=num;i++)
			{
				if (num%i==0)
				{
					System.out.println(i);
					count++;
				}
				System.out.println("the count is: "+count);
				
			}
			if(count==2)
			{
				System.out.println("It is a palindrome also prime number : "+num);
			}
			else
			{
				System.out.println("It is a palinrome but not prime number"+num);
			}
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
	}

}
