package Extraction;

public class sp {
   public static void main(String[] args) {
	int num=242664253,rem=0,sum=0,prod=1;
	while(num!=0)
	{
		rem=num%10;
		if(rem%2==0)
		{
			sum=sum+rem;
		}
		else
		{
			prod=prod*rem;
		}
		num=num/10;
	}
	System.out.println(sum);
	System.out.println(prod);
	if(sum>prod)
	{
		System.out.println("The sum is greater: "+sum);

	}
	else
	{
		System.out.println("The product is greater: "+prod);
	}
   }
}
