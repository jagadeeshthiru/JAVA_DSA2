package Extraction;

public class Multiple_sum {
	public static void main(String[] args) {
		int num=7651,rem=0,prod1=1,prod2=1,count=0;
		while (num>0) 
		{
			rem=num%10;
			count =count+1;
			num=num/10;
			System.out.println(rem);
		}
		System.out.println("the total count: "+count);
		if(count==1||count==4)
		{
			prod1=prod1*rem;
			System.out.println(prod1);
			
		}
		else
			
			
		{
			prod2=prod2*rem;
			System.out.println(prod2);
		}
		
	
		System.out.println("the total sum:"+(prod1+prod2));
		
		
	}

}
