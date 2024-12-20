package Extraction;

public class NumberDivisible {
	public static void main(String[] args) {
		int num=1234,rem,sum=0,div=0;
		while(num!=0) 
		{
			
			rem=num%10;
			
			System.out.println(rem);
			num=num/10;
		    sum=sum+rem;
		    
			
		}
		
		System.out.println(sum);
		
	

	}
	
}
