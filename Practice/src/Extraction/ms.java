package Extraction;

public class ms {
   public static void main(String[] args) {
	int num=1234,rem=0,sum=0,prod=1,dig=0, prod1=1;
	while(num!=0)
	{
		rem=num%10;
		num=num/10;
		dig++;
		if(dig==1||dig==2)
		{
			prod1=prod1*rem;
		}
		else 
		{
			prod=prod*rem;
		}
		
	}
	System.out.println(prod1);
	System.out.println(prod);
  }
}
