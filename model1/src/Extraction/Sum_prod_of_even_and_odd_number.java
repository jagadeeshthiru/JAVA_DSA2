package Extraction;

public class Sum_prod_of_even_and_odd_number {
 public static void main(String[] args) {
	int num =225756,rem=0,sum=0,prod=1;
	while(num>0)
	{
		rem=num%10;
		num=num/10;
		if(rem%2==0)
		{
			System.out.println("even remender : "+rem);
			sum=sum+rem;
		}
		else
		{
			System.out.println("odd remender : "+rem);
			prod =prod*rem;
		}
		
	}
	System.out.println("sum of even rem"+sum);
	System.out.println("prod of odd rem"+prod);
	if(sum>=prod)
	{
		System.out.println("the greater nbr is : "+sum);
	}
	else
	{
		System.out.println("the greater nbr is : "+prod);

	}

}
}
