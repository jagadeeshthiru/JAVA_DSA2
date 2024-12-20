package numbers;

public class palindrome {
public static void main(String[] args) {
	int count=0,rem=0,rev=0;
	while(count<=20)
	{
		int num=0,temp=num;
		 num++;
		rem=num%10;
	    rev=rev*10+rem;
	    num=num/10;
	   
		count++;
	}
}
}
