package Extraction;

public class Palindrom {
   public static void main(String[] args) {
	long num=122334433221l,rem=0,rev=0,temp=num;
	System.out.println(num);
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
		System.out.println("it is a palindrome");
	}
	else
	{
		System.out.println("it is not a palindrome");
	}
}
}
