package Extraction;

public class SplitByTwo {
	public static void main(String[] args) {
		
		int num=1234,rem=0,count=0,sum1=0,sum2=0,sum=0;
		while(num!=0)
		{
			rem=num%10;
			count++; //1
			System.out.println("Total count: "+count);
			num=num/2;
			if(count==1||count==2)
			{
				sum1=sum1+rem;
				System.out.println("1st: "+sum1);
			}
			else if(count==3||count==4)
			{
				sum2=sum2+rem;
				System.out.println("2nd: "+sum2);
			}
		
			sum=sum1+sum2;
		
			
		}
		System.out.println("total sum: "+sum);

	}


}
